package org.dantassz.yukitsu.parsers.site.mangareader.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("INARIPIKAV", "InariPikav", "es")
internal class InariPikav(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.INARIPIKAV,
		"clubinari.org",
		pageSize = 10,
		searchPageSize = 10,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
