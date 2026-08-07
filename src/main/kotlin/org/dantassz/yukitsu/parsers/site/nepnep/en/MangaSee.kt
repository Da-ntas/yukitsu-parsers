package org.dantassz.yukitsu.parsers.site.nepnep.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.nepnep.NepnepParser

// site closed in favour of weeb central
@Broken
@MangaSourceParser("MANGASEE", "MangaSee", "en")
internal class MangaSee(context: MangaLoaderContext) :
	NepnepParser(context, MangaParserSource.MANGASEE, "mangasee123.com")
