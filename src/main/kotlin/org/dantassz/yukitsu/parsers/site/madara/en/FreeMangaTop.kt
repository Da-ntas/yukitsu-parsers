package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("FREEMANGATOP", "FreeMangaTop", "en")
internal class FreeMangaTop(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FREEMANGATOP, "freemangatop.com") {
	override val datePattern = "MM/dd/yyyy"

    override fun getRequestHeaders() = super.getRequestHeaders().newBuilder()
        .add("Referer", "https://$domain/")
        .build()
}
