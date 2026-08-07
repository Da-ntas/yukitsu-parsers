package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("S2MANGA", "S2Manga", "en")
internal class S2Manga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.S2MANGA, "s2manga.com") {
	override val datePattern = "MMMM dd, yyyy"
}
