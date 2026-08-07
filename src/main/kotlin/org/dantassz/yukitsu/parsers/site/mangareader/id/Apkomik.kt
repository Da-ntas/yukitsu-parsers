package org.dantassz.yukitsu.parsers.site.mangareader.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("APKOMIK", "Apkomik", "id")
internal class Apkomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.APKOMIK, "apkomik.cc", pageSize = 20, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
