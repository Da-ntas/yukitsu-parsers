package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken("Not dead, changed template")
@MangaSourceParser("SINENSISSCANS", "SinensisScans", "pt")
internal class SinensisScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SINENSISSCANS, "sinensis.leitorweb.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
