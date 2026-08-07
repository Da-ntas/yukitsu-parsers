package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("COLORED_MANGA", "ColoredManga", "en")
internal class ColoredManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COLORED_MANGA, "coloredmanga.net") {
	override val datePattern = "dd-MMM"
}
