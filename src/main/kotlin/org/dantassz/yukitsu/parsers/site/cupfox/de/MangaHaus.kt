package org.dantassz.yukitsu.parsers.site.cupfox.de

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.cupfox.CupFoxParser

@MangaSourceParser("MANGAHAUS", "MangaHaus", "de")
internal class MangaHaus(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.MANGAHAUS, "www.mangahaus.com")
