package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAOWL_IO", "MangaOwl.io", "en")
internal class MangaOwlIo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAOWL_IO, "mangaowl.io") {
	override val listUrl = "mangaowl-all/"
}
