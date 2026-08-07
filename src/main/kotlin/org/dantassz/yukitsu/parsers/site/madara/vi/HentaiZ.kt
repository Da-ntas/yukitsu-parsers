package org.dantassz.yukitsu.parsers.site.madara.vi

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.model.*
import org.dantassz.yukitsu.parsers.util.*
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("HENTAIZ", "HentaiZ", "vi", ContentType.HENTAI)
internal class HentaiZ(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAIZ, "hentaiz.news", 24) {
	override val listUrl = "truyen-hentai/"
	override val tagPrefix = "the-loai/"
	override val datePattern = "dd/MM/yyyy"

	override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
		val fullUrl = manga.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()

		val href = doc.selectFirst("head meta[property='og:url']")?.attr("content")?.toRelativeUrl(domain) ?: manga.url
		val testCheckAsync = doc.select(selectTestAsync)
		val chaptersDeferred = if (testCheckAsync.isEmpty()) {
			async { loadChapters(href, doc) }
		} else {
			async { getChapters(manga, doc) }
		}

		val desc = doc.select(selectDesc).html()

		val stateDiv = doc.selectFirst(selectState)?.selectLast("div.summary-content")

		val state = stateDiv?.let {
			when (it.text().lowercase()) {
				in ongoing -> MangaState.ONGOING
				in finished -> MangaState.FINISHED
				in abandoned -> MangaState.ABANDONED
				in paused -> MangaState.PAUSED
				else -> null
			}
		}

		val alt = doc.body().select(selectAlt).firstOrNull()?.tableValue()?.textOrNull()

		manga.copy(
			url = href,
			publicUrl = href.toAbsoluteUrl(domain),
			tags = doc.body().select(selectGenre).mapToSet { a ->
				MangaTag(
					key = a.attr("href").removeSuffix("/").substringAfterLast('/'),
					title = a.text().toTitleCase(),
					source = source,
				)
			},
			description = desc,
			altTitles = setOfNotNull(alt),
			state = state,
			chapters = chaptersDeferred.await(),
			contentRating = ContentRating.ADULT,
		)
	}
}
