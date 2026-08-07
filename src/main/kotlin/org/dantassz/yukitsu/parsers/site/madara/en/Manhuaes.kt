package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAES", "ManhuaEs", "en")
internal class Manhuaes(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAES, "manhuaes.com") {
	override val postReq = true
}
