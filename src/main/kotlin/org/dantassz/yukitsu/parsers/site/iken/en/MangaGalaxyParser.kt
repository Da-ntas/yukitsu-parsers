package org.dantassz.yukitsu.parsers.site.iken.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.iken.IkenParser

@Broken("Redirect to VortexScans")
@MangaSourceParser("MANGAGALAXY", "MangaGalaxy", "en")
internal class MangaGalaxyParser(context: MangaLoaderContext) :
	IkenParser(context, MangaParserSource.MANGAGALAXY, "vortexscans.org", 18)
