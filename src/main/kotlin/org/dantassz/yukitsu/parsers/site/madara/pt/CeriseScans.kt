package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken("Not dead, changed template")
@MangaSourceParser("CERISE_SCANS", "CeriseScans", "pt")
internal class CeriseScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CERISE_SCANS, "cerise.leitorweb.com") {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
