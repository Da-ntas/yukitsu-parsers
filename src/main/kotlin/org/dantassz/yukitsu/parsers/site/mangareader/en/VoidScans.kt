package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@Broken("Redirect to HiveComic")
@MangaSourceParser("VOIDSCANS", "HiveToon", "en")
internal class VoidScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.VOIDSCANS, "hivetoon.com", pageSize = 15, searchPageSize = 10)
