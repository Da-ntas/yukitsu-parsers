package org.dantassz.yukitsu.parsers.site.fmreader.ja

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.fmreader.FmreaderParser

@MangaSourceParser("WELOMA", "Weloma", "ja")
internal class Weloma(context: MangaLoaderContext) :
	FmreaderParser(context, MangaParserSource.WELOMA, "weloma.art")
