package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("RICHTOSCAN", "RichtoScan", "es")
internal class RichtoScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RICHTOSCAN, "r1.richtoon.top") {
	override val tagPrefix = "manga-generos/"
	override val sourceLocale: Locale = Locale.ENGLISH
}
