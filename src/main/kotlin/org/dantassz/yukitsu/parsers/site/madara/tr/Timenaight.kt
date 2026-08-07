package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("TIMENAIGHT", "TimeNaight", "tr")
internal class Timenaight(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TIMENAIGHT, "timenaight.org") {
	override val postReq = true
	override val datePattern = "dd/MM/yyyy"
}
