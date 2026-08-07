package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("PORTALYAOI", "PortalYaoi", "pt", ContentType.HENTAI)
internal class PortalYaoi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PORTALYAOI, "portalyaoi.com", 10) {
	override val tagPrefix = "genero/"
	override val datePattern: String = "dd/MM"
}
