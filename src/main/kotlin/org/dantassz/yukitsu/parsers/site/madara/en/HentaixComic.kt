package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HENTAIXCOMIC", "Hentai x Comic", "en", ContentType.HENTAI)
internal class HentaixComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAIXCOMIC, "hentaixcomic.com", 16) {
	override val postReq = true
}
