package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("WONDERLANDSCAN", "WonderlandScan", "pt")
internal class WonderlandScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WONDERLANDSCAN, "wonderlandscan.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
