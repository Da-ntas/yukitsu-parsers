package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LIMITEDTIMEPOJECT", "LimitedTimePoject", "pt")
internal class LimitedTimePoject(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIMITEDTIMEPOJECT, "limitedtimeproject.com", 10) {
	override val listUrl = "manhwa/"
	override val tagPrefix = "manhwa-genero/"
	override val datePattern = "dd/MM/yyyy"
}
