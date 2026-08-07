package org.dantassz.yukitsu.parsers.site.zeistmanga.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("GALAXSCANS", "GalaxScanlator", "pt")
internal class GalaxScans(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.GALAXSCANS, "galaxscanlator.blogspot.com") {
	override val mangaCategory = "Recentes"
	override val sateOngoing: String = "Lançando"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
