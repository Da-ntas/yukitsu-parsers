package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MSYPUBLISHER", "MsyPublisher", "en")
internal class MsyPublisher(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MSYPUBLISHER, "msypublisher.com", 20) {
	override val listUrl = "manhua/"
	override val selectGenre = "manhua-genre/"
}
