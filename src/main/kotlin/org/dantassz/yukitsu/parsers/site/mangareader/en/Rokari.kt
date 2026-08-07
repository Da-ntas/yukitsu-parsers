package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("ROKARICOMICS", "Rokari Comics", "en")
internal class RokariComics(context: MangaLoaderContext) :
	MangaReaderParser(
		context = context,
		source = MangaParserSource.ROKARICOMICS,
		domain = "rokaricomics.com",
		pageSize = 20,
		searchPageSize = 10,
	) {

	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectChapter = "#chapterlist > ul > li:has(a[href])"

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)

}
