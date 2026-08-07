package org.dantassz.yukitsu.parsers.site.zeistmanga.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("LER999", "Ler999", "pt")
internal class Ler999(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.LER999, "ler999.blogspot.com")
