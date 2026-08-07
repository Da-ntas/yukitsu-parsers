package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ANIKIGA", "Anikiga", "tr")
internal class Anikiga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ANIKIGA, "anikiga.com") {
	override val tagPrefix = "manga-tur/"
	override val datePattern = "d MMMM yyyy"
	override val postReq = true
}
