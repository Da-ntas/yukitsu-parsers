package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("PIANMANGA", "PianManga", "en")
internal class PianManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PIANMANGA, "pianmanga.me", pageSize = 10) {
	override val datePattern = "MMMM dd, yyyy"
}
