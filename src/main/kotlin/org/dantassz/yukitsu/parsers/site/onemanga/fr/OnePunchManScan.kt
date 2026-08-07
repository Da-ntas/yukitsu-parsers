package org.dantassz.yukitsu.parsers.site.onemanga.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("ONEPUNCHMANSCAN", "OnePunchManScan", "fr")
internal class OnePunchManScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.ONEPUNCHMANSCAN, "onepunchmanscan.com")
