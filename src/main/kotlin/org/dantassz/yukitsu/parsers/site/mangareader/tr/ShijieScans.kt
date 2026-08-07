package org.dantassz.yukitsu.parsers.site.mangareader.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SHIJIESCANS", "ShijieScans", "tr")
internal class ShijieScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SHIJIESCANS, "shijiescans.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/seri"
}
