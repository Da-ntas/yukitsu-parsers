package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("FURYMANGA", "KingOfScans", "en")
internal class FuryManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.FURYMANGA, "myshojo.com", pageSize = 30, searchPageSize = 10) {
	override val listUrl = "/comics"
}
