package org.dantassz.yukitsu.parsers.site.mangareader.it

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("WALPURGISCAN", "WalpurgiScan", "it")
internal class Walpurgiscan(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.WALPURGISCAN,
		"www.walpurgiscan.it",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val datePattern = "MMM d, yyyy"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
