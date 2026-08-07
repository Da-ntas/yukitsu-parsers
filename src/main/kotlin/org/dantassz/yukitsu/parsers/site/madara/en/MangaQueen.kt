package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGA_QUEEN", "MangaQueen", "en")
internal class MangaQueen(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA_QUEEN, "mangaqueen.com", 16)
