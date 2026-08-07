package org.dantassz.yukitsu.parsers.site.mangareader.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("PRUNUSSCANS", "PrunusScans", "tr")
internal class PrunusScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.PRUNUSSCANS, "prunusscans.com", pageSize = 20, searchPageSize = 10)
