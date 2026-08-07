package org.dantassz.yukitsu.parsers.site.mangareader.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("CULTURESUBS", "CultureSubs", "tr")
internal class CultureSubs(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.CULTURESUBS, "culturesubs.com", pageSize = 20, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isMultipleTagsSupported = false,
		)
}
