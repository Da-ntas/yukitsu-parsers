package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentRating
import org.dantassz.yukitsu.parsers.model.Manga
import org.dantassz.yukitsu.parsers.model.MangaListFilter
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.model.MangaState
import org.dantassz.yukitsu.parsers.model.MangaTag
import org.dantassz.yukitsu.parsers.model.SortOrder
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.util.attrAsRelativeUrlOrNull
import org.dantassz.yukitsu.parsers.util.attrOrNull
import org.dantassz.yukitsu.parsers.util.generateUid
import org.dantassz.yukitsu.parsers.util.host
import org.dantassz.yukitsu.parsers.util.mapNotNullToSet
import org.dantassz.yukitsu.parsers.util.oneOrThrowIfMany
import org.dantassz.yukitsu.parsers.util.parseFailed
import org.dantassz.yukitsu.parsers.util.parseHtml
import org.dantassz.yukitsu.parsers.util.removeSuffix
import org.dantassz.yukitsu.parsers.util.src
import org.dantassz.yukitsu.parsers.util.toAbsoluteUrl
import org.dantassz.yukitsu.parsers.util.toTitleCase
import org.dantassz.yukitsu.parsers.util.urlEncoded
import kotlin.collections.orEmpty
import kotlin.text.ifEmpty

@MangaSourceParser("TOPMANHUA", "ManhuaTop", "en")
internal class TopManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TOPMANHUA, "manhuatop.org") {
	override val tagPrefix = "manhua-genre/"
	override val listUrl = "series/"
	override val datePattern = "MM/dd/yyyy"

    init {
        paginator.firstPage = 1
        searchPaginator.firstPage = 1
    }

    override suspend fun getListPage(page: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
        val url = buildString {
            append("https://")
            append(domain)
            when {
                !filter.query.isNullOrEmpty() -> {
                    append("/$listUrl?q=")
                    append(filter.query.urlEncoded())
                    append("?page=")
                    append(page.toString())
                }

                else -> {
                    val tag = filter.tags.oneOrThrowIfMany()

                    if (filter.tags.isNotEmpty()) {
                        append("?$tagPrefix=")
                        append(tag?.key.orEmpty())
                        append("?page=")
                        append(page.toString())
                        append("&")
                    } else {
                        append("/$listUrl")
                        append("?page=")
                        append(page.toString())
                        append("&")
                    }

                    append("sort=")
                    when (order) {
                        SortOrder.POPULARITY -> append("views")
                        SortOrder.UPDATED -> append("latest_update")
                        SortOrder.NEWEST -> append("newest")
                        SortOrder.RATING -> append("rating")
                        SortOrder.POPULARITY_WEEK -> append("trending-week")
                        SortOrder.POPULARITY_MONTH -> append("trending-month")
                        SortOrder.POPULARITY_YEAR -> append("trending-year")
                        else -> append("latest_update")
                    }
                }
            }
        }

        val doc = webClient.httpGet(url).parseHtml()

        val content = doc.selectFirst("div[id=S:1]") ?: doc
        return content.select("main ul.discovery-grid li.manga-card-main").ifEmpty {
            content.select("main ul.manga-grid li.manga-card")
        }.map { li ->
            val href = li.selectFirst("a")?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link not found")
            val summary = li.selectFirst("a") ?: li.selectFirst(".manga-card-body .card-title-row a")
            val author = summary?.selectFirst(".mg_author")?.selectFirst("a")?.ownText()
            Manga(
                id = generateUid(href),
                url = href,
                publicUrl = href.toAbsoluteUrl(li.host ?: domain),
                coverUrl = li.selectFirst("img")?.src(),
                title = (summary?.attrOrNull("aria-label")) ?: summary?.text().orEmpty(),
                altTitles = emptySet(),
                rating = li.selectFirst("span.total_votes")?.ownText()?.toFloatOrNull()?.div(5f) ?: -1f,
                tags = summary?.selectFirst(".mg_genres")?.select("a")?.mapNotNullToSet { a ->
                    MangaTag(
                        key = a.attr("href").removeSuffix('/').substringAfterLast('/'),
                        title = a.text().ifEmpty { return@mapNotNullToSet null }.toTitleCase(),
                        source = source,
                    )
                }.orEmpty(),
                state = when (summary?.selectFirst(".mg_status")?.selectFirst(".summary-content")?.ownText()
                    ?.lowercase().orEmpty()) {
                    in ongoing -> MangaState.ONGOING
                    in finished -> MangaState.FINISHED
                    else -> null
                },
                authors = setOfNotNull(author),
                source = source,
                contentRating = if (isNsfwSource) ContentRating.ADULT else null,
            )
        }
    }
}
