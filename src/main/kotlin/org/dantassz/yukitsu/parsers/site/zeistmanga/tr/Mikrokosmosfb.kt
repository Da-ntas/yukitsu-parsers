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

@MangaSourceParser("MIKROKOSMOSFB", "Mikrokosmosfb", "tr", ContentType.HENTAI)
internal class Mikrokosmosfb(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MIKROKOSMOSFB, "mikrokosmosfb.blogspot.com") {
	override val sateOngoing: String = "Devam Ediyor"
	override val sateFinished: String = "Tamamlandı"
	override val sateAbandoned: String = "Güncel"

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		val tags = doc.selectFirstOrThrow("script:containsData(label: )").data()
			.substringAfter("label: [").substringBefore("]").replace("\"", "").split(", ")
		return tags.mapToSet {
			MangaTag(
				key = it,
				title = it,
				source = source,
			)
		}
	}
}
