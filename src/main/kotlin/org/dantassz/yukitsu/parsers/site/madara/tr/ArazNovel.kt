package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ARAZNOVEL", "ArazNovel", "tr")
internal class ArazNovel(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARAZNOVEL, "araznovel.com", 10) {
	override val datePattern = "d MMMM yyyy"
	override val postReq = true
}
