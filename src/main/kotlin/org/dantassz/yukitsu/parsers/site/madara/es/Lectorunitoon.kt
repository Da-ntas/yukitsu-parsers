package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LECTORUNITOON", "LectoruniToon", "es")
internal class Lectorunitoon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LECTORUNITOON, "lectorunitoon.com", 10) {
	override val tagPrefix = "generos/"
	override val datePattern = "dd/MM/yyyy"
}
