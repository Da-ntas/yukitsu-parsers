package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("TATAKAE_SCANS", "TatakaeScans", "pt")
internal class TatakaeScansParser(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TATAKAE_SCANS, "tatakaescan.com", pageSize = 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
