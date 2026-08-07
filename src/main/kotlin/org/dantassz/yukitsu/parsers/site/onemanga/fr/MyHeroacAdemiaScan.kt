package org.dantassz.yukitsu.parsers.site.onemanga.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("MYHEROACADEMIASCAN", "MyHeroacAdemiaScan", "fr")
internal class MyHeroacAdemiaScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.MYHEROACADEMIASCAN, "myheroacademiascan.com")
