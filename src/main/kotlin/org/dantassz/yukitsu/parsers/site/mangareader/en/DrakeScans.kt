package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("DRAKESCANS", "DrakeComic", "en")
internal class DrakeScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DRAKESCANS, "drakecomic.org", 20, 10)
