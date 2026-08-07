package org.dantassz.yukitsu.parsers.site.mangareader.id

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("KYUMIK", "Kyumik", "id", ContentType.HENTAI)
internal class Kyumik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KYUMIK, "kyumik.com", pageSize = 20, searchPageSize = 10)
