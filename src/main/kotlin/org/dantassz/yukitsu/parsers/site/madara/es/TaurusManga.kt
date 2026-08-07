package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("TAURUSMANGA", "TaurusManga", "es")
internal class TaurusManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TAURUSMANGA, "taurus.topmanhuas.org") {
	override val datePattern = "dd/MM/yyyy"
}
