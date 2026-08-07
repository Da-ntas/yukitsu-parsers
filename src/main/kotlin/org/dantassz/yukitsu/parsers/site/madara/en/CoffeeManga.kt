package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("COFFEE_MANGA", "CoffeeManga", "en")
internal class CoffeeManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COFFEE_MANGA, "coffeemanga.io")
