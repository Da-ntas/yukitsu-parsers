package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("HUNTERSSCANEN", "EnHuntersScan", "en")
internal class HuntersScanEn(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HUNTERSSCANEN, "en.huntersscan.xyz") {
	override val datePattern = "MM/dd/yyyy"
	override val tagPrefix = "series-genre/"
	override val listUrl = "manga/"
}
