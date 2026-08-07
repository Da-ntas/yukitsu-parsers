package org.dantassz.yukitsu.parsers.site.zeistmanga.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("DUOSCANLATORS", "DuoScanlators", "pt")
internal class DuoScanlators(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.DUOSCANLATORS, "duoscanlators.blogspot.com")
