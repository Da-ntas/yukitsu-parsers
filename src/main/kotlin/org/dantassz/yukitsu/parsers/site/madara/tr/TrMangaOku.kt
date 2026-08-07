package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("TRMANGAOKU", "TrMangaOku", "tr")
internal class TrMangaOku(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TRMANGAOKU, "trmangaoku.com") {
	override val tagPrefix = "tur/"
}
