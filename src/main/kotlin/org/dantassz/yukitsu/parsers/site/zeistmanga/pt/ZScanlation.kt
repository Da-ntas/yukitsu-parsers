package org.dantassz.yukitsu.parsers.site.zeistmanga.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@Broken
@MangaSourceParser("ZSCANLATION", "ZScanlation", "pt", ContentType.HENTAI)
internal class ZScanlation(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.ZSCANLATION, "www.zscanlation.com") {
	override val sateOngoing: String = "Em Lançamento"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
