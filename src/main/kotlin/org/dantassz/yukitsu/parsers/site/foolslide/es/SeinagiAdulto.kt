package org.dantassz.yukitsu.parsers.site.foolslide.es

import kotlinx.coroutines.coroutineScope
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.Manga
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.foolslide.FoolSlideParser
import org.dantassz.yukitsu.parsers.util.*

@MangaSourceParser("SEINAGIADULTO", "Seinagi Adulto", "es", ContentType.HENTAI)
internal class SeinagiAdulto(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaParserSource.SEINAGIADULTO, "adulto.seinagi.org.es") {

	override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
		val fullUrl = manga.url.toAbsoluteUrl(domain)
		val testAdultPage = webClient.httpGet(fullUrl).parseHtml()
		val doc = if (testAdultPage.selectFirst("div.info form") != null) {
			webClient.httpPost(fullUrl, "adult=true").parseHtml()
		} else {
			testAdultPage
		}
		val chapters = getChapters(doc)
		val desc = if (doc.selectFirstOrThrow(selectInfo).html().contains("Descripción")) {
			doc.selectFirst(selectInfo)?.text()?.substringAfter("Descripción: ")?.substringBefore("Lecturas")
		} else {
			doc.selectFirst(selectInfo)?.text()
		}
		val author = if (doc.selectFirst(selectInfo)?.html()?.contains("Author") == true) {
			doc.selectFirst(selectInfo)?.text()?.substringAfter("Author: ")?.substringBefore("Art")
		} else {
			null
		}
		manga.copy(
			coverUrl = doc.selectFirst(".thumbnail img")?.src(),// for manga result on search
			description = desc?.nullIfEmpty(),
			authors = author?.nullIfEmpty()?.let { setOf(it) } ?: emptySet(),
			chapters = chapters,
		)
	}
}
