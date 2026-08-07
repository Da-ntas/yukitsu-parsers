package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HADESNOFANSUB", "HadesNoFansub", "es")
internal class HadesNoFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HADESNOFANSUB, "hadesnofansub.com", 10) {
	override val datePattern: String = "MM/dd/yyyy"
}
