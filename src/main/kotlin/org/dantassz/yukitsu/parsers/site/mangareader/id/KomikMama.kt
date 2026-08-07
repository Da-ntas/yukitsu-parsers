package org.dantassz.yukitsu.parsers.site.mangareader.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KOMIKMAMA", "KomikMama", "id")
internal class KomikMama(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKMAMA, "komikmama.lat", pageSize = 30, searchPageSize = 10) {
	override val listUrl = "/komik"
}
