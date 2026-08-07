package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("EDOUJIN", "EHentaiManga", "en", ContentType.HENTAI)
internal class EDoujin(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.EDOUJIN, "ehentaimanga.com", pageSize = 25, searchPageSize = 10)
