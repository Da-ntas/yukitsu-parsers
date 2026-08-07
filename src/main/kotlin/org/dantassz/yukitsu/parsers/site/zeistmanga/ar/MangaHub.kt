package org.dantassz.yukitsu.parsers.site.zeistmanga.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.model.MangaState
import org.dantassz.yukitsu.parsers.model.MangaTag
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser
import org.dantassz.yukitsu.parsers.util.*
import java.util.*

@MangaSourceParser("MANGAHUB_LINK", "MangaHub.link", "ar", ContentType.HENTAI)
internal class MangaHub(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MANGAHUB_LINK, "www.mangahub.link") {

	override val sateOngoing: String = "مستمر"
	override val sateFinished: String = "مكتمل"

	override suspend fun getFilterOptions() = super.getFilterOptions().copy(
		availableStates = EnumSet.of(MangaState.ONGOING, MangaState.FINISHED),
	)

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.requireElementById("Genre").select("div.items-center").mapToSet {
			MangaTag(
				key = it.selectFirstOrThrow("input").attr("value"),
				title = it.selectFirstOrThrow("label").text().substringBefore(')').toTitleCase(sourceLocale),
				source = source,
			)
		}
	}
}
