package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ZIN_MANGA_COM", "Zin-Manga.com", "en")
internal class ZinMangaCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZIN_MANGA_COM, "zin-manga.com") {
	override val selectPage = "img"
}
