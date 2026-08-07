package org.dantassz.yukitsu.parsers.site.pizzareader.it

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("HASTATEAM_READER", "HastaTeamReader", "it")
internal class HastaTeamReader(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.HASTATEAM_READER, "reader.hastateam.com")
