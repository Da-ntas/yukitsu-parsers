package org.dantassz.yukitsu.parsers.site.mangareader.ja

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import java.util.*
import org.dantassz.yukitsu.parsers.Broken

@Broken("Need to rewrite parser, continue with rawkuma.net site, not old.rawkuma.net")
@MangaSourceParser("RAWKUMA", "Rawkuma", "ja")
internal class Rawkuma(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.RAWKUMA, "old.rawkuma.net", pageSize = 54, searchPageSize = 54) {
	override val datePattern = "MMM d, yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
