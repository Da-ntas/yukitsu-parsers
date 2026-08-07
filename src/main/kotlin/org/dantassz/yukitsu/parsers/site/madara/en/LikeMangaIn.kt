package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LIKEMANGAIN", "LikeManga.in", "en")
internal class LikeMangaIn(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIKEMANGAIN, "likemanga.in", 36) {
	override val datePattern = "d MMMM, yyyy"
}
