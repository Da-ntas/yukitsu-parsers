package org.dantassz.yukitsu.parsers.site.madtheme.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaChapter
import org.dantassz.yukitsu.parsers.model.MangaPage
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madtheme.MadthemeParser
import org.dantassz.yukitsu.parsers.util.toAbsoluteUrl
import org.dantassz.yukitsu.parsers.util.generateUid
import org.dantassz.yukitsu.parsers.util.parseHtml

@MangaSourceParser("MANGABUDDY", "MangaBuddy", "en")
internal class MangaBuddy(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.MANGABUDDY, "mangabuddy.com") {

	private val subDomain = "sb.mbcdn.xyz"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val regexPages = Regex("chapImages\\s*=\\s*['\"](.*?)['\"]")
		val pages = doc.select("script").firstNotNullOfOrNull { script ->
			regexPages.find(script.html())?.groupValues?.getOrNull(1)
		}?.split(',')

		return pages?.map { url ->
			val cleanUrl = url.substringAfter("/manga")
			MangaPage(
				id = generateUid(url),
				url = "https://$subDomain/manga$cleanUrl",
				preview = null,
				source = source,
			)
		} ?: emptyList()
	}
}
