package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("COCOMIC", "CoComic", "en", ContentType.HENTAI)
internal class CoComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COCOMIC, "cocomic.co")
