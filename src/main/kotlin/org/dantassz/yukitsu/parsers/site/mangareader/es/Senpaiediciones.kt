package org.dantassz.yukitsu.parsers.site.mangareader.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import org.dantassz.yukitsu.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("SENPAIEDICIONES", "SenpaiEdiciones", "es")
internal class Senpaiediciones(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.SENPAIEDICIONES,
		"senpaiediciones.com",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val datePattern = "MMM d, yyyy"
}
