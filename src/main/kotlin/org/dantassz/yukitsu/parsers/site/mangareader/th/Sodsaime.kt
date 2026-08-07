package org.dantassz.yukitsu.parsers.site.mangareader.th

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SODSAIME", "สดใสเมะ", "th")
internal class Sodsaime(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.SODSAIME,
		"www.xn--l3c0azab5a2gta.com",
		pageSize = 40,
		searchPageSize = 10,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
