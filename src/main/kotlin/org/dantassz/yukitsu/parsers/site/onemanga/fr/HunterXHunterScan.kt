package org.dantassz.yukitsu.parsers.site.onemanga.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("HUNTERXHUNTERSCAN", "HunterXHunterScan", "fr")
internal class HunterXHunterScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.HUNTERXHUNTERSCAN, "hunterxhunterscan.com")
