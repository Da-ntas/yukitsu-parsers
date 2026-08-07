package org.dantassz.yukitsu.parsers.site.mangareader.es

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("RAGNASCAN", "RagnaScan", "es")
internal class RagnaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.RAGNASCAN, "ragnascan.com", pageSize = 5, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
