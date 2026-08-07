package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ARMONISCANS", "ArmoniScans", "tr")
internal class ArmoniScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARMONISCANS, "armoniscans.net") {
	override val tagPrefix = "tur/"
}
