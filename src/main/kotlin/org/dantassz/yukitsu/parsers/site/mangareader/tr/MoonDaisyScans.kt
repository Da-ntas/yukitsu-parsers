package org.dantassz.yukitsu.parsers.site.mangareader.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MOONDAISY_SCANS", "MoonDaisyScans", "tr", ContentType.HENTAI)
internal class MoonDaisyScans(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.MOONDAISY_SCANS,
		"moondaisyscans.biz",
		pageSize = 20,
		searchPageSize = 10,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
