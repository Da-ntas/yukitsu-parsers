package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("SPIDERSCANS", "SpiderScans", "en")
internal class SpiderScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SPIDERSCANS, "spiderscans.xyz", pageSize = 20, searchPageSize = 10)
