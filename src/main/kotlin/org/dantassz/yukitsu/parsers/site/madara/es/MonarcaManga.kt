package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("MONARCAMANGA", "MonarcaManga", "es")
internal class MonarcaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MONARCAMANGA, "visormonarca.com") {
	override val tagPrefix = "manga-generos/"
}
