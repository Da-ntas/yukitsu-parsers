package org.dantassz.yukitsu.parsers.site.hotcomics.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.hotcomics.HotComicsParser

@MangaSourceParser("TOOMICSESLA", "TooMicsEsLa", "es")
internal class TooMicsEsLa(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.TOOMICSESLA, "toomics.com/mx") {
	override val isSearchSupported = false
	override val mangasUrl = "/webtoon/ranking/genre"
	override val selectMangas = "li > div.visual"
	override val selectMangaChapters = "li.normal_ep:has(.coin-type1)"
	override val selectTagsList = "div.genre_list li:not(.on) a"
	override val selectPages = "div[id^=load_image_] img"
	override val onePage = true
}
