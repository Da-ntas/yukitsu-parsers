package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("NIVERAFANSUB", "NiveraFansub", "tr", ContentType.HENTAI)
internal class NiveraFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIVERAFANSUB, "niverafansub.org") {
	override val datePattern = "d MMMM yyyy"
}
