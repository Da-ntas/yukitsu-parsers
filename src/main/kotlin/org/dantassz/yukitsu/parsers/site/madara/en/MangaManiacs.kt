package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAMANIACS", "MangaManiacs", "en", ContentType.HENTAI)
internal class MangaManiacs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAMANIACS, "mangamaniacs.org", 10)
