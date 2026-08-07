package org.dantassz.yukitsu.parsers.site.heancmsalt.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.heancmsalt.HeanCmsAlt
import org.dantassz.yukitsu.parsers.Broken

@Broken("Not dead, changed template")
@MangaSourceParser("LEGIONSCANS", "CerberusSeries", "es")
internal class CerberuSeries(context: MangaLoaderContext) :
	HeanCmsAlt(context, MangaParserSource.LEGIONSCANS, "legionscans.com")
