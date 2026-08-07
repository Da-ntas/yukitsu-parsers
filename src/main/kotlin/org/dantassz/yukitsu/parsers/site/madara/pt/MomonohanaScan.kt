package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MOMONOHANASCAN", "MomonohanaScan", "pt")
internal class MomonohanaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MOMONOHANASCAN, "momonohanascan.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
