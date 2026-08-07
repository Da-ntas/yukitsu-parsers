package org.dantassz.yukitsu.parsers.site.otakusanctuary.vi

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.otakusanctuary.OtakuSanctuaryParser
import org.dantassz.yukitsu.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("OTAKUSAN_VI", "Otaku Sanctuary (VN)", "vi")
internal class OtakusanVi(context: MangaLoaderContext) :
	OtakuSanctuaryParser(context, MangaParserSource.OTAKUSAN_VI, "otakusan.me") {
	override val selectState = ".table-info tr:contains(Status) td"
	override val lang = "vn"
}
