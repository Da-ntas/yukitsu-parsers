package org.dantassz.yukitsu.parsers.site.mangareader.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGAFLAME", "MangaFlame", "ar")
internal class MangaFlame(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAFLAME, "mangaflame.org", pageSize = 20, searchPageSize = 10)
