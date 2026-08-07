package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("YCSCAN", "YcScan", "pt", ContentType.HENTAI)
internal class Ycscan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YCSCAN, "ycscan.com", 20) {
	override val datePattern: String = "dd/MM/yyyy"
}
