package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HENTAIXYURI", "HentaiXYuri", "en", ContentType.HENTAI)
internal class HentaixYuri(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAIXYURI, "hentaixyuri.com", 16) {
	override val postReq = true
}
