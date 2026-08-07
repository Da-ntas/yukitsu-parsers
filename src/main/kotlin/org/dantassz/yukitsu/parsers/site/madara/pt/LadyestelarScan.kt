package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LADYESTELARSCAN", "LadyEstelarScan", "pt")
internal class LadyestelarScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LADYESTELARSCAN, "ladyestelarscan.com.br", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
