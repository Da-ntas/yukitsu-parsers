package org.dantassz.yukitsu.parsers.site.madara.id

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("YUBIKIRI", "Yubikiri", "id")
internal class Yubikiri(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YUBIKIRI, "yubikiri.my.id", 18) {
	override val tagPrefix = "genre/"
	override val datePattern = "d MMMM"
}
