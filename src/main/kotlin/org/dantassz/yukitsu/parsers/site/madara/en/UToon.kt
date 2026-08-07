package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("UTOON", "UToon", "en")
internal class UToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.UTOON, "utoon.net") {
	override val datePattern = "dd MMM"
}
