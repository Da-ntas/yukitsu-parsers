package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LILYUMFANSUB", "LilyumFansub", "tr")
internal class LilyumFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LILYUMFANSUB, "lilyumfansub.com.tr", 16)
