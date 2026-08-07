package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGATX_CC", "MangaTx.cc", "en")
internal class MangaTxCc(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGATX_CC, "mangatx.cc", 30, 21) {
	override val datePattern = "dd-MM-yyyy"
	override val listUrl = "/manga-list"
}
