package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HAYALISTIC", "Hayalistic", "tr")
internal class Hayalistic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HAYALISTIC, "hayalistic.com.tr", 24) {
	override val datePattern = "dd/MM/yyyy"
}
