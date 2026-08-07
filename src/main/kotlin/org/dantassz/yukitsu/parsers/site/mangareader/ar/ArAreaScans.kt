package org.dantassz.yukitsu.parsers.site.mangareader.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ARAREASCANS", "ArAreaScans", "ar")
internal class ArAreaScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ARAREASCANS, "ar.kenmanga.com", pageSize = 20, searchPageSize = 10) {

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
