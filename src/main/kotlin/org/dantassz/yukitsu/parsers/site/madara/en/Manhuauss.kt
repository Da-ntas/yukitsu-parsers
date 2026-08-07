package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAUSS", "Manhuauss", "en")
internal class Manhuauss(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAUSS, "manhuauss.com") {
	override val withoutAjax = true
}
