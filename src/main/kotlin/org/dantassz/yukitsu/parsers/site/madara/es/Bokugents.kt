package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("BOKUGENTS", "Bokugents", "es")
internal class Bokugents(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BOKUGENTS, "bokugents.com")
// For this source need to enable the option to ignore SSL errors
