package org.dantassz.yukitsu.parsers.site.madara.all

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import java.util.*

@Broken
@MangaSourceParser("MANGATOP", "MangaTop", "", ContentType.HENTAI)
internal class MangaTop(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATOP, "mangatop.site") {
	override val datePattern = "d MMMM yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val stylePage = ""
}
