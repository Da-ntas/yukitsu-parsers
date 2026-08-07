package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATR", "MangaTr", "tr")
internal class MangaTr(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATR, "mangatr.app") {
	override val tagPrefix = "tur/"
}
