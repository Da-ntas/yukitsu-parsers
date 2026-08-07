package org.dantassz.yukitsu.parsers.site.zeistmanga.tr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.model.MangaTag
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser
import org.dantassz.yukitsu.parsers.util.mapToSet
import org.dantassz.yukitsu.parsers.util.parseHtml
import org.dantassz.yukitsu.parsers.util.selectFirstOrThrow

@MangaSourceParser("SNSCOEURTURKEY", "SnscoeurTurkey", "tr", ContentType.HENTAI)
internal class SnscoeurTurkey(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.SNSCOEURTURKEY, "snscoeurturkey.blogspot.com") {
	override val sateOngoing: String = "Güncel"
	override val sateFinished: String = "Final"
	override val sateAbandoned: String = "Düzenleniyor"

	override val mangaCategory = "Seriler"

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain/p/gelismis-arama.html").parseHtml()
		return doc.selectFirstOrThrow("div.filter").select("ul li").mapToSet {
			MangaTag(
				key = it.selectFirstOrThrow("input").attr("value"),
				title = it.selectFirstOrThrow("label").text(),
				source = source,
			)
		}
	}
}
