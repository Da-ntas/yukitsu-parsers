package org.dantassz.yukitsu.parsers.site.manga18.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.manga18.Manga18Parser

@MangaSourceParser("PORNCOMIC18", "18PornComic", "en", ContentType.HENTAI)
internal class PornComic18(context: MangaLoaderContext) :
	Manga18Parser(context, MangaParserSource.PORNCOMIC18, "18porncomic.com") {
	override val selectTag = "div.item:not(.info_label) div.info_value a"
}
