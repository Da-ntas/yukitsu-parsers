package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("KABUSMANGA", "KabusManga", "tr")
internal class KabusManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KABUSMANGA, "kabusmanga.com") {
	override val datePattern = "dd/MM/yyyy"
}
