package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("XSSCAN", "XsScan", "pt")
internal class XsScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.XSSCAN, "xsscan.xyz") {
	override val datePattern: String = "dd/MM/yyyy"
}
