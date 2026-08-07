package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("CAFECOMYAOI", "CafecomYaoi", "pt", ContentType.HENTAI)
internal class CafecomYaoi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CAFECOMYAOI, "cafecomyaoi.com.br") {
	override val datePattern = "dd/MM/yyyy"
}
