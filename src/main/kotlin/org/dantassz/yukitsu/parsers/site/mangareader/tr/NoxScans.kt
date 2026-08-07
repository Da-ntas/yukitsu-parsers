package org.dantassz.yukitsu.parsers.site.mangareader.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("NOXSCANS", "NoxScans", "tr")
internal class NoxScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NOXSCANS, "www.noxscans.com", pageSize = 30, searchPageSize = 20) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
