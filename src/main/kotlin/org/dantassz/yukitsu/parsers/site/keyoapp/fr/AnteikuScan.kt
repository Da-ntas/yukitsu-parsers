package org.dantassz.yukitsu.parsers.site.keyoapp.fr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("ANTEIKUSCAN", "AnteikuScan", "fr")
internal class AnteikuScan(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.ANTEIKUSCAN, "anteikuscan.fr")
