package org.dantassz.yukitsu.parsers.site.keyoapp.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("EDSCANLATION", "EdScanlation", "fr")
internal class EdScanlation(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.EDSCANLATION, "edscanlation.fr")
