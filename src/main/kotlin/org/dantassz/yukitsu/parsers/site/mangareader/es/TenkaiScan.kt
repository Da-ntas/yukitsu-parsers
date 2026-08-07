package org.dantassz.yukitsu.parsers.site.mangareader.es

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import java.util.*

@Broken("Not dead, changed template")
@MangaSourceParser("TENKAISCAN", "TenkaiScan", "es", ContentType.HENTAI)
internal class TenkaiScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TENKAISCAN, "falcoscan.net", 20, 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
