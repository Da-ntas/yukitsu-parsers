package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("TILKISCANS", "TilkiScans", "tr")
internal class TilkiScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TILKISCANS, "www.tilkiscans.com", pageSize = 18) {
	override val datePattern = "dd/MM/yyyy"
}
