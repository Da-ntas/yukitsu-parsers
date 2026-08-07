package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HERENSCAN", "HerenScan", "es")
internal class HerenScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HERENSCAN, "herenscan.com") {
	override val datePattern = "dd/MM/yyyy"
}
