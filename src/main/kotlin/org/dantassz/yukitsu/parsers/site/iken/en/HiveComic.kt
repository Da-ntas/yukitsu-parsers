package org.dantassz.yukitsu.parsers.site.iken.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.iken.IkenParser

@MangaSourceParser("HIVECOMIC", "HiveComic", "en")
internal class HiveComic(context: MangaLoaderContext) :
	IkenParser(context, MangaParserSource.HIVECOMIC, "hivetoons.org", 18, true)
