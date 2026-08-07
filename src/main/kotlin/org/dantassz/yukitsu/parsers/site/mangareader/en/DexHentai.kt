package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DEXHENTAI", "DexHentai", "en", ContentType.HENTAI)
internal class DexHentai(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DEXHENTAI, "dexhentai.com", 40, 36)
