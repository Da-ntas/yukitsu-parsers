package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ONLYMANHWA", "OnlyManhwa", "en")
internal class OnlyManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ONLYMANHWA, "onlymanhwa.org") {
	override val listUrl = "manhwa/"
	override val datePattern = "d 'de' MMMM 'de' yyyy"
}
