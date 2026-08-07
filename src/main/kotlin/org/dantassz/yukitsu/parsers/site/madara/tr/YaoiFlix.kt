package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIFLIX", "YaoiFlix", "tr", ContentType.HENTAI)
internal class YaoiFlix(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIFLIX, "yaoiflix.me", 16)
