package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("BARMANGA", "BarManga", "es")
internal class BarManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BARMANGA, "barmanga.com") {
	override val datePattern = "MM/dd/yyyy"
}
