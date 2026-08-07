package org.dantassz.yukitsu.parsers.site.madara.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ASQORG", "3Asq", "ar")
internal class Asq(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ASQORG, "3asq.org") {
	override val datePattern = "d MMMM، yyyy"
}
