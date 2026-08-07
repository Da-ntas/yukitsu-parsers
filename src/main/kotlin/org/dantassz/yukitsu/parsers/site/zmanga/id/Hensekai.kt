package org.dantassz.yukitsu.parsers.site.zmanga.id

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zmanga.ZMangaParser
import java.util.*

@Broken
@MangaSourceParser("HENSEKAI", "Hensekai", "id", ContentType.HENTAI)
internal class Hensekai(context: MangaLoaderContext) :
	ZMangaParser(context, MangaParserSource.HENSEKAI, "hensekai.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
