package org.dantassz.yukitsu.parsers.site.mangareader.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("FLARES", "Fl-Ares", "ar")
internal class FlAres(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.FLARES, "fl-ares.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
	override val encodedSrc = true
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
