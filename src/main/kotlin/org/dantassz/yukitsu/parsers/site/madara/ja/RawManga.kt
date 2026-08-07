package org.dantassz.yukitsu.parsers.site.madara.ja

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("RAWMANGA", "RawManga", "ja")
internal class RawManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAWMANGA, "rawmanga.su", 24) {
	override val listUrl = "r/"
	override val selectPage = "div.mg-item"
}
