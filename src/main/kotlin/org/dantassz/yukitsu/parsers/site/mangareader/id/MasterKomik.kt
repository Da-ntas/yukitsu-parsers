package org.dantassz.yukitsu.parsers.site.mangareader.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MASTERKOMIK", "Tenshi", "id")
internal class MasterKomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MASTERKOMIK, "tenshi01.id", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
	override val listUrl = "/komik"
}
