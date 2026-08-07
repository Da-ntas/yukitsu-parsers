package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LILYMANGA", "LilyManga", "en", ContentType.HENTAI)
internal class LilyManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LILYMANGA, "lilymanga.net") {
	override val tagPrefix = "ys-genre/"
	override val listUrl = "ys/"
	override val datePattern = "yyyy-MM-dd"
}
