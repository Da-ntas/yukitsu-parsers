package org.dantassz.yukitsu.parsers.site.zeistmanga.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("GISTAMISHOUSEFANSUB", "GistamisHouseFansub", "es")
internal class GistamisHouseFansub(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.GISTAMISHOUSEFANSUB, "gistamishousefansub.blogspot.com") {
	override val sateOngoing: String = "Activo"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Cancelado"
	override val selectPage = ".post img"
}
