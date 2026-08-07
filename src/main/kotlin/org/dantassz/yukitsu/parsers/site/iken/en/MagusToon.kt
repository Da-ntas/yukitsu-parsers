package org.dantassz.yukitsu.parsers.site.iken.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.iken.IkenParser

@MangaSourceParser("MAGUSMANGA", "MagusToon", "en")
internal class MagusToon(context: MangaLoaderContext) :
        IkenParser(context, MangaParserSource.MAGUSMANGA, "magustoon.org", 18, true)
