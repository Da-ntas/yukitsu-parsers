package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("GARCIAMANGA", "GarciaManga", "tr")
internal class GarciaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GARCIAMANGA, "garciamanga.com", 20) {
	override val selectPage = "img"
}
