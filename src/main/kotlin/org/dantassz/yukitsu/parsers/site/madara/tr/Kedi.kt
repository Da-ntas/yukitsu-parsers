package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("KEDI", "Kedi", "tr")
internal class Kedi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KEDI, "kedi.to") {
	override val datePattern = "d MMMM yyyy"
	override val tagPrefix = "tur/"
}
