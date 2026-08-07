package org.dantassz.yukitsu.parsers.site.foolslide.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.foolslide.FoolSlideParser

@MangaSourceParser("DEATHTOLLSCANS", "DeathTollScans", "en")
internal class Deathtollscans(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaParserSource.DEATHTOLLSCANS, "reader.deathtollscans.net", 26)
