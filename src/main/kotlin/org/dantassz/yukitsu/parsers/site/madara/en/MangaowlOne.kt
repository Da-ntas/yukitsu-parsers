package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAOWL_ONE", "MangaOwl.one", "en", ContentType.HENTAI)
internal class MangaowlOne(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAOWL_ONE, "mangaowl.one") {
	override val postReq = true
}
