package org.dantassz.yukitsu.parsers.site.liliana.ja

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.liliana.LilianaParser

@MangaSourceParser("RAW1001", "Raw1001", "ja")
internal class Raw1001(context: MangaLoaderContext) :
	LilianaParser(context, MangaParserSource.RAW1001, "raw1001.net")
