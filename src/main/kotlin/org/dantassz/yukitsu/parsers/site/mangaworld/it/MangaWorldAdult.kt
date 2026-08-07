package org.dantassz.yukitsu.parsers.site.mangaworld.it

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangaworld.MangaWorldParser

@MangaSourceParser("MANGAWORLDADULT", "MangaWorldAdult", "it")
internal class MangaWorldAdult(
	context: MangaLoaderContext,
) : MangaWorldParser(context, MangaParserSource.MANGAWORLDADULT, "mangaworldadult.net")
