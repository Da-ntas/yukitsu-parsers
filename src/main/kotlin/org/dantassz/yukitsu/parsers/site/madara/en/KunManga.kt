package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("KUNMANGA", "KunManga", "en")
internal class KunManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KUNMANGA, "kunmanga.com", 10)
