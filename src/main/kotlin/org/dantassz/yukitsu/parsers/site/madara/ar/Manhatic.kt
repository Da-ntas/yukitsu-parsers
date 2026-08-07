package org.dantassz.yukitsu.parsers.site.madara.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("MANHATIC", "Manhatic", "ar", ContentType.HENTAI)
internal class Manhatic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHATIC, "manhatic.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
