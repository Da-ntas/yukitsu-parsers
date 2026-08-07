package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LHTRANSLATION", "LhTranslation", "en")
internal class LhTranslation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LHTRANSLATION, "lhtranslation.net")
