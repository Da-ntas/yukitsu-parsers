package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAFOXFULL", "MangaFoxFull", "en")
internal class MangaFoxFull(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAFOXFULL, "mangafoxfull.com") {
	override val postReq = true
}
