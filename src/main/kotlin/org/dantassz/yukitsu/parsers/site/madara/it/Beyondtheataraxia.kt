package org.dantassz.yukitsu.parsers.site.madara.it

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("BEYONDTHEATARAXIA", "Beyond The Ataraxia", "it")
internal class Beyondtheataraxia(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BEYONDTHEATARAXIA, "www.beyondtheataraxia.com", 10) {
	override val datePattern = "d MMMM yyyy"
}
