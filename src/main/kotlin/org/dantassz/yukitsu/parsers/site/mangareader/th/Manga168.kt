package org.dantassz.yukitsu.parsers.site.mangareader.th

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGA168", "Manga168", "th", ContentType.HENTAI)
internal class Manga168(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGA168, "manga168.net", pageSize = 40, searchPageSize = 30) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
