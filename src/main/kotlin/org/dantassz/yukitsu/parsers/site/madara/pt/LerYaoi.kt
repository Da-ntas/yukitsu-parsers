package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LERYAOI", "LerYaoi", "pt", ContentType.HENTAI)
internal class LerYaoi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LERYAOI, "leryaoi.com", 10) {
	override val datePattern = "dd/MM/yyyy"
	override val listUrl = "bl/"
	override val tagPrefix = "genero/"
}
