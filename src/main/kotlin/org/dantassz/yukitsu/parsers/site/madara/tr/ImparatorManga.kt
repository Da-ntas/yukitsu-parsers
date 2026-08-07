package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("IMPARATORMANGA", "ImparatorManga", "tr")
internal class ImparatorManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IMPARATORMANGA, "www.imparatormanga.com")
