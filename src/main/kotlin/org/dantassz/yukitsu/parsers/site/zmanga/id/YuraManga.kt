package org.dantassz.yukitsu.parsers.site.zmanga.id

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zmanga.ZMangaParser

@Broken
@MangaSourceParser("YURAMANGA", "YuraManga", "id")
internal class YuraManga(context: MangaLoaderContext) :
	ZMangaParser(context, MangaParserSource.YURAMANGA, "www.yuramanga.my.id")

