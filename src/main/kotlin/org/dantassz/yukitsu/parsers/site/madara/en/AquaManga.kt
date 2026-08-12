package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.*
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.util.*

@MangaSourceParser("AQUAMANGA", "AquaManga", "en")
internal class AquaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.AQUAMANGA, "aquareader.org", 24){

    override val listUrl = "/manga"
    override val withoutAjax = true

    init {
        paginator.firstPage = 1
        searchPaginator.firstPage = 1
    }

    override suspend fun getListPage(page: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
        val pages = page + 1

        val url = buildString {
            append("https://")
            append(domain)
            append(listUrl)

            if (pages > 1) {
                append("/page/")
                append(pages.toString())
            }
            append("/?search=")

            filter.query?.let {
                append(filter.query.urlEncoded())
            }

            append("&post_type=wp-manga")

            // Known bug: in some cases, if there are no manga with the associated tags, the source returns the full list of manga
            if (filter.tags.isNotEmpty()) {
                filter.tags.forEach {
                    append("&genre[]=")
                    append(it.key)
                }
            }

            filter.states.forEach {
                append("&status[]=")
                when (it) {
                    MangaState.ONGOING -> append("on-going")
                    MangaState.FINISHED -> append("end")
                    MangaState.ABANDONED -> append("canceled")
                    MangaState.PAUSED -> append("on-hold")
                    MangaState.UPCOMING -> append("upcoming")
                    else -> throw IllegalArgumentException("$it not supported")
                }
            }

            filter.contentRating.oneOrThrowIfMany()?.let {
                append("&adult=")
                append(
                    when (it) {
                        ContentRating.SAFE -> "0"
                        ContentRating.ADULT -> "1"
                        else -> ""
                    },
                )
            }

            if (filter.year != 0) {
                append("&release=")
                append(filter.year.toString())
            }

            if (!filter.author.isNullOrEmpty()) {
                filter.author.let {
                    append("&author=")
                    // should be like "minamida-usuke"
                    append(it.lowercase().replace(" ", "-"))
                }
            }

            // Support artist
            //filter.artist?.let {
            //	append("&artist=")
            //	append(filter.artist)
            //}


            append("&m_orderby=")
            when (order) {
                SortOrder.POPULARITY -> append("views")
                SortOrder.UPDATED -> append("latest")
                SortOrder.NEWEST -> append("new-manga")
                SortOrder.ALPHABETICAL -> append("alphabet")
                SortOrder.RATING -> append("rating")
                SortOrder.RELEVANCE -> {}
                else -> append("new-manga")
            }
        }

        val doc = webClient.httpGet(url).parseHtml()

        val elements = doc.select("div.row.c-tabs-item__content").ifEmpty {
            doc.select("div.page-item-detail").ifEmpty {
                doc.select("div.aqua-archive-grid")
            }
        }

        if (elements.isEmpty()) {
            return emptyList()
        }

        return elements.map { div ->
            val href = div.selectFirstOrThrow("a").attrAsRelativeUrlOrNull("href") ?: div.parseFailed("Link not found")
            val summary = div.selectFirst(".tab-summary") ?: div.selectFirst(".item-summary") ?: div.selectFirst(".aqua-archive-card__body")
            val author = summary?.selectFirst(".mg_author")?.selectFirst("a")?.ownText()

            Manga(
                id = generateUid(href),
                url = href,
                publicUrl = href.toAbsoluteUrl(div.host ?: domain),
                coverUrl = div.selectFirst("img")?.src(),
                title = (summary?.selectFirst("h3, h4")?.selectFirstOrThrow("a") ?: div.selectFirst(".manga-name, .post-title"))?.text()
                    .orEmpty(),
                altTitles = emptySet(),
                rating = div.selectFirst("span.aqua-archive-card__rating-badge")?.ownText()?.toFloatOrNull()?.div(5f) ?: RATING_UNKNOWN,
                tags = summary?.selectFirst(".mg_genres")?.select("a")?.mapNotNullToSet { a ->
                    MangaTag(
                        key = a.attr("href").removeSuffix('/').substringAfterLast('/'),
                        title = a.text().ifEmpty { return@mapNotNullToSet null }.toTitleCase(),
                        source = source,
                    )
                }.orEmpty(),
                authors = setOfNotNull(author),
                state = when (
                    div?.selectFirst("span.manga-status")
                        ?.ownText()?.lowercase()
                        .orEmpty()
                ) {
                    in ongoing -> MangaState.ONGOING
                    in finished -> MangaState.FINISHED
                    in abandoned -> MangaState.ABANDONED
                    in paused -> MangaState.PAUSED
                    in upcoming -> MangaState.UPCOMING
                    else -> null
                },
                source = source,
                contentRating = if (isNsfwSource) ContentRating.ADULT else null,
            )
        }
    }
}
