package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ATIKROST", "Atikrost", "tr")
internal class Atikrost(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ATIKROST, "www.mangaoku.org", 10) {
	override val datePattern = "d MMMM yyyy"
}
