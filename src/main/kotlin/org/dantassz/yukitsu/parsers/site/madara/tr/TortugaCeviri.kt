package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("TORTUGACEVIRI", "TortugaCeviri", "tr")
internal class TortugaCeviri(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TORTUGACEVIRI, "tortugaceviri.com")
