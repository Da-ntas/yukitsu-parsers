package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HENTAITECA", "Hentaiteca", "pt", ContentType.HENTAI)
internal class Hentaiteca(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAITECA, "hentaiteca.net", pageSize = 10) {
	override val datePattern = "MM/dd/yyyy"
	override val tagPrefix = "genero/"
}
