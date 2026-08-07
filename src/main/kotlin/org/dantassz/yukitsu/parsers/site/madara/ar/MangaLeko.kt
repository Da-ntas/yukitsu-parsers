package org.dantassz.yukitsu.parsers.site.madara.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALEKO", "Manga-Leko.org", "ar")
internal class MangaLeko(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALEKO, "manga-leko.org", pageSize = 10)
