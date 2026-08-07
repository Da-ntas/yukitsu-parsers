package org.dantassz.yukitsu.parsers.site.madara.id

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("INDO18H", "Indo18h", "id", ContentType.HENTAI)
internal class Indo18h(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.INDO18H, "indo18h.com", 24) {
	override val withoutAjax = true
}
