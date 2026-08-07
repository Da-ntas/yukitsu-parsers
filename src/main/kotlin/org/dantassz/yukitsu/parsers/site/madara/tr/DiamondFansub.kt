package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("DIAMONDFANSUB", "DiamondFansub", "tr")
internal class DiamondFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DIAMONDFANSUB, "diamondfansub.com", 10) {
	override val datePattern = "d MMMM"
	override val listUrl = "seri/"
	override val tagPrefix = "seri-turu/"
}
