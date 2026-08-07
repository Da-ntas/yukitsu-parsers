package org.dantassz.yukitsu.parsers.site.madara.ar

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken("Website is down or domain has been changed")
@MangaSourceParser("MANGARBIC", "MangaArabic", "ar")
internal class Mangarbic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGARBIC, "lekmanga.net") {
	override val postReq = true
	override val datePattern = "yyyy/MM/dd"
}
