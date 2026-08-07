package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ATLANTISSCAN", "AtlantisScan", "es")
internal class AtlantisScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ATLANTISSCAN, "scansatlanticos.com", pageSize = 50) {
	override val datePattern = "dd/MM/yyyy"
}
