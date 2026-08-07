package org.dantassz.yukitsu.parsers.site.mangareader.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KANZENIN", "Kanzenin", "id", ContentType.HENTAI)
internal class Kanzenin(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KANZENIN, "kanzenin.info", pageSize = 27, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
