package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("VERMANHWA", "Vermanhwa", "es", ContentType.HENTAI)
internal class Vermanhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.VERMANHWA, "vermanhwa.com", 10)
