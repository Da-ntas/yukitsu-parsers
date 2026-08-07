package org.dantassz.yukitsu.parsers.site.zeistmanga.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser


@MangaSourceParser("MAGERIN", "Magerin", "id")
internal class Magerin(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MAGERIN, "www.magerin.com")
