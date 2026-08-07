package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser


@MangaSourceParser("MUGIMANGA", "MugiManga", "tr")
internal class MugiManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MUGIMANGA, "mugimanga.com", 20) {
	override val datePattern = "dd/MM/yyyy"
}
