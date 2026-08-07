package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LUNARSCAN", "LunarrScan.com", "pt")
internal class LunarScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LUNARSCAN, "lunarrscan.com")
