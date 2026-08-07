package org.dantassz.yukitsu.parsers.site.madara.ar

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("SHADOWXMANGA", "ShadowXManga", "ar")
internal class ShadowxManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SHADOWXMANGA, "www.shadowxmanga.com") {
	override val datePattern = "yyyy/MM/dd"
}
