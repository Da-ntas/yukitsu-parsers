package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentRating
import org.dantassz.yukitsu.parsers.model.Manga
import org.dantassz.yukitsu.parsers.model.MangaChapter
import org.dantassz.yukitsu.parsers.model.MangaListFilter
import org.dantassz.yukitsu.parsers.model.MangaPage
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.model.MangaState
import org.dantassz.yukitsu.parsers.model.MangaTag
import org.dantassz.yukitsu.parsers.model.RATING_UNKNOWN
import org.dantassz.yukitsu.parsers.model.SortOrder
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.util.attrAsRelativeUrl
import org.dantassz.yukitsu.parsers.util.attrAsRelativeUrlOrNull
import org.dantassz.yukitsu.parsers.util.attrOrNull
import org.dantassz.yukitsu.parsers.util.generateUid
import org.dantassz.yukitsu.parsers.util.host
import org.dantassz.yukitsu.parsers.util.mapNotNullToSet
import org.dantassz.yukitsu.parsers.util.mapToSet
import org.dantassz.yukitsu.parsers.util.oneOrThrowIfMany
import org.dantassz.yukitsu.parsers.util.parseFailed
import org.dantassz.yukitsu.parsers.util.parseHtml
import org.dantassz.yukitsu.parsers.util.parseJson
import org.dantassz.yukitsu.parsers.util.removeSuffix
import org.dantassz.yukitsu.parsers.util.requireSrc
import org.dantassz.yukitsu.parsers.util.selectFirstOrThrow
import org.dantassz.yukitsu.parsers.util.src
import org.dantassz.yukitsu.parsers.util.toAbsoluteUrl
import org.dantassz.yukitsu.parsers.util.toTitleCase
import org.dantassz.yukitsu.parsers.util.urlEncoded
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import java.time.Instant


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

    override suspend fun getChapters(manga: Manga, doc: Document):List<MangaChapter> {
        // url example in f12
        // https://manhuatop.org/api/reader?resource=chapters&path=%2Fmanhua%2Finvincible-recommended%2F%3Ftab%3Dchapters
        val path = "$manga.url?tab=chapters".urlEncoded()
        val chapterUrl = buildString {
            append("https://")
            append(domain)
            append("/api/reader?resource=chapters&path=")
            append(path)
        }
        val response = webClient.httpGet(chapterUrl).parseJson()
        val items = response.optJSONArray("items") ?: return emptyList()

        return (0 until items.length()).mapNotNull { i ->
            val item = items.optJSONObject(i) ?: return@mapNotNull null

            val title = item.optString("title")
            val href = item.optString("path")
            val date = item.optString("date")

            val number = Regex("""\d+(?:\.\d+)?""")
                .find(title)
                ?.value
                ?.toFloatOrNull()
                ?: (i + 1).toFloat()

            MangaChapter(
                id = generateUid(href),
                title = title,
                number = number,
                volume = 0,
                url = href,
                scanlator = null,
                branch = null,
                source = source,
                uploadDate = runCatching {
                    Instant.parse(date).toEpochMilli()
                }.getOrDefault(0L),
            )
        }
    }

    override suspend fun getDetails(manga: Manga): Manga {
        val doc = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
        val content = doc.selectFirst("div[id=S:1]") ?: doc
        val statusText = content.selectFirst("span.status-badge")?.text().orEmpty()
        val emptyDoc = Jsoup.parse("")

        return manga.copy(
            tags = content.select("a[href^='/$tagPrefix/']").mapToSet {
                val key = it.attr("href").substringAfter("$tagPrefix/")
                MangaTag(
                    key = key,
                    title = it.text(),
                    source = source,
                )
            },
            description = content.selectFirst("div.rich-content.synopsis")?.text(),
            state = when (statusText) {
                "Ongoing" -> MangaState.ONGOING
                "Canceled" -> MangaState.ABANDONED
                "Completed" -> MangaState.FINISHED
                "On hold" -> MangaState.PAUSED
                else -> null
            },
            chapters = getChapters(manga, emptyDoc),
//            content.select("div.chapter-grid").mapChapters(reversed = false) { i, el ->
//                val href = el.selectFirstOrThrow("a").attrAsRelativeUrl("href")
//
//                MangaChapter(
//                    id = generateUid(href),
//                    title =  el.selectFirstOrThrow("strong").text(),
//                    number = el.selectFirst("strong")?.text()?.toFloat() ?: (i + 1).toFloat(),
//                    volume = 0,
//                    url = href,
//                    scanlator = null,
//                    branch = null,
//                    source = source,
//                    uploadDate = el.selectFirst("time")?.attr("datetime") ?.let { runCatching { Instant.parse(it).toEpochMilli() }.getOrNull() } ?: 0L
//                )
//            }
        )
    }

    override suspend fun getRelatedManga(seed: Manga): List<Manga> {
        val doc = webClient.httpGet(seed.url.toAbsoluteUrl(domain)).parseHtml()
        val content = doc.selectFirst("div[id=S:1]") ?: doc
        val root = content.selectFirstOrThrow(".related-manga")

        return root.select("li.manga-card-related").mapNotNull { li ->
            val a = li.selectFirst("a") ?: return@mapNotNull null
            val href = a.attrAsRelativeUrl("href")
            Manga(
                id = generateUid(href),
                url = href,
                publicUrl = href.toAbsoluteUrl(a.host ?: domain),
                altTitles = emptySet(),
                title = li.selectFirstOrThrow("div.manga-card-body hr a").text(),
                authors = emptySet(),
                coverUrl = li.selectFirst("img")?.src(),
                tags = emptySet(),
                rating = RATING_UNKNOWN,
                state = null,
                contentRating = if (isNsfwSource) ContentRating.ADULT else null,
                source = source,
            )
        }
    }
    override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
        val doc = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()
        val content = doc.selectFirst("div[id=S:1]") ?: doc
        return content.select(".reader-content img").map {
            val url = it.requireSrc()
            MangaPage(
                id = generateUid(url),
                url = url,
                preview = null,
                source = source
            )
        }
    }
}
