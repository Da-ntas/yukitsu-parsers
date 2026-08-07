package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("GOODGIRLS", "GoodGirls", "en")
internal class GoodGirls(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GOODGIRLS, "goodgirls.moe", 10) {
	override val selectDesc = "div.post-content_item:contains(Synopsis) div.summary-content"
}
