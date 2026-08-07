package org.dantassz.yukitsu.parsers.site.mangareader.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGASHIINA", "MangaMukai.com", "es")
internal class MangaShiina(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASHIINA, "mangamukai.com", pageSize = 20, searchPageSize = 10)
