package org.dantassz.yukitsu.parsers.site.cupfox.fr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.cupfox.CupFoxParser

@Broken
@MangaSourceParser("ENLIGNEMANGA", "EnLigneManga", "fr")
internal class EnLigneManga(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.ENLIGNEMANGA, "www.enlignemanga.com")
