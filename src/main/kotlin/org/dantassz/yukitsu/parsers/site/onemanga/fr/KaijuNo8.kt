package org.dantassz.yukitsu.parsers.site.onemanga.fr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.onemanga.OneMangaParser

@Broken
@MangaSourceParser("KAIJUNO8", "KaijuNo8", "fr")
internal class KaijuNo8(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.KAIJUNO8, "kaijuno8.fr")
