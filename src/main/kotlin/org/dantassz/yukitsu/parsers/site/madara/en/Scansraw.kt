package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("SCANSRAW", "AquaScans.com", "en")
internal class Scansraw(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SCANSRAW, "aquascans.com", 10)
