package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LERMANGAS", "Lermangas", "pt")
internal class Lermangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LERMANGAS, "lermangas.me", pageSize = 20) {
	override val datePattern = "dd 'de' MMMMM 'de' yyyy"
}
