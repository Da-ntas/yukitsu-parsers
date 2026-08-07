package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("KALANGO", "Kalango", "pt")
internal class Kalango(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KALANGO, "kalango.org") {
	override val datePattern: String = "dd 'de' MMMM 'de' yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
}
