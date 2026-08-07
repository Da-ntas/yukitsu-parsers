package org.dantassz.yukitsu.parsers.site.keyoapp.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("ARVENSCANS", "ArvenComics", "en")
internal class ArvenScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.ARVENSCANS, "arvencomics.com")
