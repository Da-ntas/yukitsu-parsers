package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("PASSAMAOSCAN", "PassamaoScan", "pt")
internal class PassamaoScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PASSAMAOSCAN, "passamaoscan.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
