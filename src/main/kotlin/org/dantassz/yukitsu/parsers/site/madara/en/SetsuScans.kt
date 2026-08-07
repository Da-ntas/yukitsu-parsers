package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("SETSUSCANS", "SetsuScans", "en")
internal class SetsuScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SETSUSCANS, "setsuscans.com")
