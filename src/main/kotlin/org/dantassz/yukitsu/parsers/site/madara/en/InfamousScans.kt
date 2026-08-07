package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("INFAMOUSSCANS", "InfamousScans", "en")
internal class InfamousScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.INFAMOUSSCANS, "infamous-scans.com", 10)
