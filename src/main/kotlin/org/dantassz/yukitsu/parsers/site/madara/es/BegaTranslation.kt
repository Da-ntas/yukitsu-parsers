package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("BEGATRANSLATION", "BegaTranslation", "es")
internal class BegaTranslation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BEGATRANSLATION, "begatranslation.com") {
	override val datePattern = "dd/MM/yyyy"
	override val listUrl = "series/"
}
