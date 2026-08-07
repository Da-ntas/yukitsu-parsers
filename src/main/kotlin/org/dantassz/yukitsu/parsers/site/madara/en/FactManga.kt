package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("FACTMANGA", "FactManga", "en")
internal class FactManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FACTMANGA, "factmanga.com")
