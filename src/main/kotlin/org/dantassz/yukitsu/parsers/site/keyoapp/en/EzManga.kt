package org.dantassz.yukitsu.parsers.site.keyoapp.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("EZMANGA", "EzManga", "en")
internal class EzManga(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.EZMANGA, "ezmanga.org")
