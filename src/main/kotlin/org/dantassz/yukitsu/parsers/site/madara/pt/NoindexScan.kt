package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("NOINDEXSCAN", "NoindexScan", "pt", ContentType.HENTAI)
internal class NoindexScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NOINDEXSCAN, "noindexscan.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
