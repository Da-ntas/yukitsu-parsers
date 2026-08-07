package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("YAOIMOBI", "Yaoi.Mobi", "en", ContentType.HENTAI)
internal class YaoiMobi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIMOBI, "yaoi.mobi") {
	override val postReq = true
}
