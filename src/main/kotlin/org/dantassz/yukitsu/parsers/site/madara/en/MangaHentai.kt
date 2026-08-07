package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAHENTAI", "MangaHentai", "en", ContentType.HENTAI)
internal class MangaHentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAHENTAI, "mangahentai.me", 20) {

	override val tagPrefix = "manga-hentai-genre/"
	override val listUrl = "manga-hentai/"
}
