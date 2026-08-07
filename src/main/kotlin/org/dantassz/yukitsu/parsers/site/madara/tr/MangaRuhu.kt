package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGARUHU", "MangaRuhu", "tr")
internal class MangaRuhu(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGARUHU, "mangaruhu.com", 16)
