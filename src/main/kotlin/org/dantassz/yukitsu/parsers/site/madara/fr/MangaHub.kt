package org.dantassz.yukitsu.parsers.site.madara.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAHUB", "MangaHub", "fr", ContentType.HENTAI)
internal class MangaHub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAHUB, "mangahub.fr") {
	override val datePattern = "d MMMM yyyy"
}
