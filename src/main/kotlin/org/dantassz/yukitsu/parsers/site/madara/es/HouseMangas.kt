package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken("Not dead, changed template")
@MangaSourceParser("HOUSEMANGAS", "HouseMangas", "es")
internal class HouseMangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HOUSEMANGAS, "visormanga.com")
