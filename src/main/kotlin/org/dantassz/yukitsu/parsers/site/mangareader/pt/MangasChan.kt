package org.dantassz.yukitsu.parsers.site.mangareader.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("MANGASCHAN", "MangasChan", "pt")
internal class MangasChan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASCHAN, "mangaschan.net", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMMM d, yyyy"
}
