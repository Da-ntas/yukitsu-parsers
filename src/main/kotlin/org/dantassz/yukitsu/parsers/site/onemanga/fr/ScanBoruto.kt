package org.dantassz.yukitsu.parsers.site.onemanga.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("SCANBORUTO", "ScanBoruto", "fr")
internal class ScanBoruto(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.SCANBORUTO, "scanboruto.fr")
