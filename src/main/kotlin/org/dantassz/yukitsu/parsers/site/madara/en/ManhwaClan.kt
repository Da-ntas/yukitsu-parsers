package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWACLAN", "ManhwaClan", "en")
internal class ManhwaClan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWACLAN, "manhwaclan.com", pageSize = 10) {
	override val datePattern = "MMMM dd, yyyy"
}
