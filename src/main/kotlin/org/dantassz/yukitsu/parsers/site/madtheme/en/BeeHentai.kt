package org.dantassz.yukitsu.parsers.site.madtheme.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("BEEHENTAI", "BeeHentai", "en", ContentType.HENTAI)
internal class BeeHentai(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.BEEHENTAI, "beehentai.com") {
	override val selectDesc = "div.section-body"
}
