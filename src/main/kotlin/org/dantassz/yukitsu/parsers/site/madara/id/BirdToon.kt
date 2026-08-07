package org.dantassz.yukitsu.parsers.site.madara.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("BIRDTOON", "BirdToon", "id", ContentType.HENTAI)
internal class BirdToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BIRDTOON, "birdtoon.shop", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val tagPrefix = "komik-genre/"
	override val listUrl = "komik/"
}
