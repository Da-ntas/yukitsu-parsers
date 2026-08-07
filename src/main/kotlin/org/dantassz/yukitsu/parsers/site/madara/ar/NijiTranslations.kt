package org.dantassz.yukitsu.parsers.site.madara.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.model.ContentType

@MangaSourceParser("NIJITRANSLATIONS", "Niji Translations", "ar", type = ContentType.HENTAI)
internal class NijiTranslations(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIJITRANSLATIONS, "niji-translations.com") {
	override val postReq = true
}
