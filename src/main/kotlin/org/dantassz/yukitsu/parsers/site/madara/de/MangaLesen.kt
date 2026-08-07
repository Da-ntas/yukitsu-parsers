package org.dantassz.yukitsu.parsers.site.madara.de

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGALESEN", "MangaLesen", "de")
internal class MangaLesen(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALESEN, "mangalesen.net")
