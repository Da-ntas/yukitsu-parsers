package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HOIFANSUB", "HoiFansub", "tr")
internal class HoiFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HOIFANSUB, "hoifansub.com", 20)
