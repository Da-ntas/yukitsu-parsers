package org.dantassz.yukitsu.parsers.site.keyoapp.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("SURYASCANS", "GenzToon", "en")
internal class SuryaScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.SURYASCANS, "genzupdates.com")
