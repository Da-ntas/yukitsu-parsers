package org.dantassz.yukitsu.parsers.site.mangareader.fr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@Broken
@MangaSourceParser("JAPSCANSFR", "JapScans.fr", "fr")
internal class JapScansFR(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.JAPSCANSFR, "japscans.fr", pageSize = 20, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
