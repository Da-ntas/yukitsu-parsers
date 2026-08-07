package org.dantassz.yukitsu.parsers.site.mmrcms.id

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("KOMIKID", "KomikId", "id")
internal class KomikId(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.KOMIKID, "komiku.org") {
	override val selectState = "dt:contains(Status)"
	override val selectAlt = "dt:contains(Other names)"
	override val selectAut = "dt:contains(Author(s))"
	override val selectTag = "dt:contains(Categories)"
	override val sourceLocale: Locale = Locale.ENGLISH
}
