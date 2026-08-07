package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ALONESCANLATOR", "AloneScanlator", "pt")
internal class AloneScanlator(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ALONESCANLATOR, "alonescanlator.com.br", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
