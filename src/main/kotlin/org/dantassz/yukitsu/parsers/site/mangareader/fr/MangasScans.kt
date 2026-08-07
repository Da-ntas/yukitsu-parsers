package org.dantassz.yukitsu.parsers.site.mangareader.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGASSCANS", "MangasScans", "fr")
internal class MangasScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASSCANS, "mangas-scans.com", pageSize = 30, searchPageSize = 10)
