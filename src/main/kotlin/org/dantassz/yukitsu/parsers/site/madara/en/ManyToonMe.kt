package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANYTOONME", "ManyToon.me", "en", ContentType.HENTAI)
internal class ManyToonMe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANYTOONME, "manytoon.me", 20) {
	override val listUrl = "manhwa/"
	override val tagPrefix = "manhwa-genre/"
}
