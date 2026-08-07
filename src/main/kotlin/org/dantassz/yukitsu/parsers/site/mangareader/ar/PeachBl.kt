package org.dantassz.yukitsu.parsers.site.mangareader.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("PEACHBL", "PeachBl", "ar", ContentType.HENTAI)
internal class PeachBl(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.PEACHBL, "peach-bl.com", pageSize = 20, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
