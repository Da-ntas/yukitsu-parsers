package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAKISS", "MangaKiss", "en")
internal class MangaKiss(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAKISS, "mangakiss.org", 10)
