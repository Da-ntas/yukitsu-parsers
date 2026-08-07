package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("COMICSVALLEY", "ComicsValley", "en", ContentType.HENTAI)
internal class ComicsValley(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COMICSVALLEY, "comicsvalley.com") {
	override val listUrl = "adult-comics/"
	override val tagPrefix = "comic-genre/"
	override val datePattern = "dd/MM/yyyy"
}
