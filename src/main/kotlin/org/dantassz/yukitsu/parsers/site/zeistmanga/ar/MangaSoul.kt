package org.dantassz.yukitsu.parsers.site.zeistmanga.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("MANGASOUL", "MangaSoul", "ar")
internal class MangaSoul(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MANGASOUL, "www.manga-soul.com")
