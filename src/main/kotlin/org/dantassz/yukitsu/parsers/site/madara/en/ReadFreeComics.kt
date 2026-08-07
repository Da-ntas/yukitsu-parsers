package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("READFREECOMICS", "ReadFreeComics", "en")
internal class ReadFreeComics(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.READFREECOMICS, "readfreecomics.com") {
	override val tagPrefix = "webtoon-comic-genre/"
	override val listUrl = "webtoon-comic/"
}
