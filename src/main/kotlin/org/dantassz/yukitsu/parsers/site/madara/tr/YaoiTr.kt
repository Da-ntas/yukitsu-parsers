package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("YAOITR", "YaoiTr", "tr")
internal class YaoiTr(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOITR, "yaoitr.fun", 16) {
	override val datePattern = "d MMMM yyyy"
}
