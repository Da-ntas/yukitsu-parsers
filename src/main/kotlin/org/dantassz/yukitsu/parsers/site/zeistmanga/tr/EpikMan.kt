package org.dantassz.yukitsu.parsers.site.zeistmanga.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.model.MangaTag
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser
import org.dantassz.yukitsu.parsers.util.mapToSet
import org.dantassz.yukitsu.parsers.util.parseHtml
import org.dantassz.yukitsu.parsers.util.requireElementById

@Broken
@MangaSourceParser("EPIKMAN", "EpikMan", "tr")
internal class EpikMan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.EPIKMAN, "www.epikman.ga") {
	override val sateOngoing = "Devam Ediyor"
	override val sateFinished = "Tamamlandı"
	override val mangaCategory = "Seri"

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.requireElementById("LinkList1").select("ul li a").mapToSet {
			MangaTag(
				key = it.attr("href").substringBefore("?").substringAfterLast('/'),
				title = it.text(),
				source = source,
			)
		}
	}
}
