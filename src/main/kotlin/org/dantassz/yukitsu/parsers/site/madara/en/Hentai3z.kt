package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken("Redirect to @hentai20")
@MangaSourceParser("HENTAI3Z", "Hentai3z", "en", ContentType.HENTAI)
internal class Hentai3z(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAI3Z, "manga18h.xyz", pageSize = 20) {
	override val withoutAjax = true
}
