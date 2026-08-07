package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOISCAN", "YaoiScan", "en", ContentType.HENTAI)
internal class YaoiScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOISCAN, "yaoiscan.com", 20)
