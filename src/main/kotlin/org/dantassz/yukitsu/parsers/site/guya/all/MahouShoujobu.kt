package org.dantassz.yukitsu.parsers.site.guya.all

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.guya.GuyaParser

@MangaSourceParser("MAHOUSHOUJOBU", "MahouShoujobu")
internal class MahouShoujobu(context: MangaLoaderContext) :
	GuyaParser(context, MangaParserSource.MAHOUSHOUJOBU, "mahoushoujobu.com")
