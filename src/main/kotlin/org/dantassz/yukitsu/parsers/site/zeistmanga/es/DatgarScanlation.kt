package org.dantassz.yukitsu.parsers.site.zeistmanga.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("DATGARSCANLATION", "DatgarScanlation", "es")
internal class DatgarScanlation(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.DATGARSCANLATION, "datgarscanlation.blogspot.com")
