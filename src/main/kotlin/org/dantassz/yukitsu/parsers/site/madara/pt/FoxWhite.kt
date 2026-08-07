package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("FOXWHITE", "FoxWhite", "pt")
internal class FoxWhite(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FOXWHITE, "foxwhite.com.br")
