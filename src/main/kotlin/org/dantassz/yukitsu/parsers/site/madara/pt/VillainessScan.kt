package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("VILLAINESSSCAN", "VillainessScan", "pt", ContentType.HENTAI)
internal class VillainessScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.VILLAINESSSCAN, "villainessscan.xyz", pageSize = 10) {
	override val datePattern: String = "dd 'de' MMMM 'de' yyyy"
}
