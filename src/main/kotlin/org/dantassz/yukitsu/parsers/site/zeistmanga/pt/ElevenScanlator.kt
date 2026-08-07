package org.dantassz.yukitsu.parsers.site.zeistmanga.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("ELEVENSCANLATOR", "ElevenScanlator", "pt")
internal class ElevenScanlator(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.ELEVENSCANLATOR, "elevenscanlator.blogspot.com") {
	override val sateOngoing: String = "Lançando"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
