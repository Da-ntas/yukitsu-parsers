package org.dantassz.yukitsu.parsers.site.mangareader.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import org.dantassz.yukitsu.parsers.model.*
import org.dantassz.yukitsu.parsers.util.*

@MangaSourceParser("SSSSCANLATOR", "YomuComics", "pt")
internal class SssScanlator(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SSSSCANLATOR, "yomucomics.com", pageSize = 20, searchPageSize = 10) {

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)

	override suspend fun getDetails(manga: Manga): Manga {
		val docs = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val chapters = docs.select(selectChapter).mapChapters { index, element ->
			val url = element.selectFirst("a")?.attrAsRelativeUrl("href") ?: return@mapChapters null
			val name = element.selectFirst(".chapternum")?.text() ?: "Chapter ${index + 1}"
			val numChap = findNumChap(name)
			MangaChapter(
				id = generateUid(url),
				title = name,
				url = url,
				number = numChap,
				volume = 0,
				scanlator = null,
				uploadDate = 0,
				branch = null,
				source = source,
			)
		}
		return parseInfo(docs, manga, chapters)
	}

	private fun findNumChap(name: String): Float {
		val regex = Regex("\\d+")
		val num = regex.find(name)
		return num?.value?.toFloat() ?: 0f
	}
}
