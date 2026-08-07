package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("KISSMANGA", "KissManga", "en")
internal class KissManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KISSMANGA, "kissmanga.in") {
	override val datePattern = "MMMM dd, yyyy"
	override val listUrl = "mangalist/"
}
