package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIMANGAOKU", "YaoiMangaOku", "tr", ContentType.HENTAI)
internal class YaoiMangaOku(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIMANGAOKU, "yaoimangaoku.net", 16) {
	override val datePattern = "d MMMM yyyy"
}
