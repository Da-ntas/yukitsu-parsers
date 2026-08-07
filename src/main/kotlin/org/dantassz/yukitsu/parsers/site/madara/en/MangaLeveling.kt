package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALEVELING", "MangaLeveling", "en")
internal class MangaLeveling(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALEVELING, "mangaleveling.com", 30) {
	override val postReq = true
	override val tagPrefix = "comics-genre/"
	override val listUrl = "comics/"
	override val datePattern = "MM/dd/yyyy"
}
