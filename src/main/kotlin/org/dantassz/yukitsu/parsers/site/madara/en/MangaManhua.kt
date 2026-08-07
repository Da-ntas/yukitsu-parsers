package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA_MANHUA", "MangaManhua", "en")
internal class MangaManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA_MANHUA, "mangaonlineteam.com", pageSize = 10)
