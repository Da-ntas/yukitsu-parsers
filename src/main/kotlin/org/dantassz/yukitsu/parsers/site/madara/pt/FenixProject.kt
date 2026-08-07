package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("FENIXPROJECT", "FenixProject", "pt")
internal class FenixProject(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FENIXPROJECT, "fenixproject.site", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
