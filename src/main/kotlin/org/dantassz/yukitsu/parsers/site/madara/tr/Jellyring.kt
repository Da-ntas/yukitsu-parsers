package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("JELLYRING", "Jellyring", "tr")
internal class Jellyring(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.JELLYRING, "jellyring.co")
