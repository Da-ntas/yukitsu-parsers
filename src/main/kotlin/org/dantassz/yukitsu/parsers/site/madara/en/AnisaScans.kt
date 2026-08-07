package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ANISASCANS", "AnisaScans", "en")
internal class AnisaScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ANISASCANS, "anisascans.in", 36) {
	override val datePattern = "dd MMM, yyyy"
}
