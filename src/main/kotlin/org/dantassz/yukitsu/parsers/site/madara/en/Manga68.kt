package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGA68", "Manga68", "en")
internal class Manga68(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA68, "manga68.com") {
	override val withoutAjax = true
}
