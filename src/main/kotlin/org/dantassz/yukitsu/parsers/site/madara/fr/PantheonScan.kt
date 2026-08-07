package org.dantassz.yukitsu.parsers.site.madara.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("PANTHEONSCAN", "PantheonScan.com", "fr")
internal class PantheonScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PANTHEONSCAN, "pantheon-scan.com") {
	override val datePattern = "d MMMM yyyy"
}
