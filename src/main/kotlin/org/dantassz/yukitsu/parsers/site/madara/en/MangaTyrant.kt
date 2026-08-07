package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATYRANT", "MangaTyrant", "en")
internal class MangaTyrant(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATYRANT, "mangatyrant.com")
