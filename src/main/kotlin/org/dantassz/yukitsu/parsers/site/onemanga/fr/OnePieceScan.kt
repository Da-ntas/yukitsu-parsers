package org.dantassz.yukitsu.parsers.site.onemanga.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("ONEPIECESCAN", "OnePieceScan", "fr")
internal class OnePieceScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.ONEPIECESCAN, "onepiecescan.fr")
