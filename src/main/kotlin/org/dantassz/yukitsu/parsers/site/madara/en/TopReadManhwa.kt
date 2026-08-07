package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("TOPREADMANHWA", "TopReadManhwa", "en")
internal class TopReadManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TOPREADMANHWA, "topreadmanhwa.com") {
	override val datePattern = "MM/dd/yyyy"
}
