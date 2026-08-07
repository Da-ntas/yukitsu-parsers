package org.dantassz.yukitsu.parsers.site.mangareader.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LIANSCANS", "LianScans", "id", ContentType.HENTAI)
internal class Lianscans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.LIANSCANS, "www.lianscans.com", pageSize = 10, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
}
