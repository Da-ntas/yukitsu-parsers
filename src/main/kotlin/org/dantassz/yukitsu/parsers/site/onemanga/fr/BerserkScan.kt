package org.dantassz.yukitsu.parsers.site.onemanga.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("BERSERKSCAN", "BerserkScan", "fr")
internal class BerserkScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.BERSERKSCAN, "berserkscan.com")
