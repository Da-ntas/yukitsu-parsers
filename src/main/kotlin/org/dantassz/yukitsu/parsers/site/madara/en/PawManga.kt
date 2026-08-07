package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("PAWMANGA", "PawManga", "en", ContentType.HENTAI)
internal class PawManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PAWMANGA, "pawmanga.com", 10)
