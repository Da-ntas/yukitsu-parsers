package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LUFFYMANGA", "LuffyManga", "en")
internal class LuffyManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LUFFYMANGA, "luffymanga.com", 10)
