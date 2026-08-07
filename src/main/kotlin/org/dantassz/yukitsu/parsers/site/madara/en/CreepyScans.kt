package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("CREEPYSCANS", "CreepyScans", "en")
internal class CreepyScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CREEPYSCANS, "creepyscans.com") {
	override val stylePage = ""
}
