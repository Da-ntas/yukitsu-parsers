package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MURIMSCAN", "InkReads", "en")
internal class MurimScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MURIMSCAN, "inkreads.com", 100) {
	override val postReq = true
	override val listUrl = "mangax/"
}
