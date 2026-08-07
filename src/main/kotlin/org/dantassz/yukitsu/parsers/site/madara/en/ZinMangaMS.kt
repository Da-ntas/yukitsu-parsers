package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ZINMANGA_MS", "ZinManga.ms", "en")
internal class ZinMangaMS(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZINMANGA_MS, "zinmanga.ms") {
	override val listUrl = "manga-1/"
	override val tagPrefix = "manga-genre-1/"
}
