package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("STONESCAPE", "StoneScape", "en")
internal class StoneScape(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.STONESCAPE, "stonescape.xyz", 10) {
	override val listUrl = "series/"
	override val tagPrefix = "series-genre/"
}
