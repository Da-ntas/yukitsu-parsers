package org.dantassz.yukitsu.parsers.site.otakusanctuary.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.otakusanctuary.OtakuSanctuaryParser
import org.dantassz.yukitsu.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("OTAKUSAN_EN", "Otaku Sanctuary (EN)", "en")
internal class OtakusanEn(context: MangaLoaderContext) :
	OtakuSanctuaryParser(context, MangaParserSource.OTAKUSAN_EN, "otakusan.me") {
	override val lang = "us"
	override val selectState = ".table-info tr:contains(Status) td"
}
