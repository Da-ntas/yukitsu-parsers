package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("NEWMANHUA", "NewManhua", "en")
internal class NewManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NEWMANHUA, "newmanhua.com", pageSize = 16)
