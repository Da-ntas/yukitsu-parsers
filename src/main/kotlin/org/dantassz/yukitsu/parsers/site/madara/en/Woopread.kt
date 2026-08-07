package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("WOOPREAD", "Woopread", "en")
internal class Woopread(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WOOPREAD, "woopread.com", 10) {
	override val listUrl = "series/"
	override val tagPrefix = "series-genres/"
}
