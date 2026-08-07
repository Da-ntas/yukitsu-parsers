package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("NIRVANASCAN", "NirvanaScan", "pt")
internal class NirvanaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIRVANASCAN, "nirvanascan.com")
