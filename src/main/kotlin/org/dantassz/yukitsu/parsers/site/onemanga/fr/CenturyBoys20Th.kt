package org.dantassz.yukitsu.parsers.site.onemanga.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.onemanga.OneMangaParser
import org.dantassz.yukitsu.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("CENTURYBOYS20TH", "20ThCenturyBoys", "fr")
internal class CenturyBoys20Th(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.CENTURYBOYS20TH, "20thcenturyboys.fr")
