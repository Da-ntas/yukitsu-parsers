package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("SSREADING", "SsReading", "pt")
internal class SsReading(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SSREADING, "ssreading.com.br") {
	override val datePattern: String = "dd 'de' MMM 'de' yyyy"
}
