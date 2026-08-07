package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.*
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser
import org.dantassz.yukitsu.parsers.util.oneOrThrowIfMany
import org.dantassz.yukitsu.parsers.util.parseHtml
import org.dantassz.yukitsu.parsers.util.urlEncoded
import java.util.*

@Broken
@MangaSourceParser("ZAHARD", "Zahard", "en")
internal class Zahard(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ZAHARD, "zahard.xyz", pageSize = 20, searchPageSize = 30) {

	override val listUrl = "/library"
	override val selectChapter = "#chapterlist > ul > a"
	override val selectPage = "div#chapter_imgs img"
	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.NEWEST)

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isMultipleTagsSupported = false,
			isTagsExclusionSupported = false,
		)

	override suspend fun getFilterOptions() = super.getFilterOptions().copy(
		availableStates = emptySet(),
	)

	override suspend fun getListPage(page: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)
			append(listUrl)
			append("?page=")
			append(page.toString())
			when {
				!filter.query.isNullOrEmpty() -> {
					append("&search=")
					append(filter.query.urlEncoded())
				}

				else -> {
					filter.tags.oneOrThrowIfMany()?.let {
						append("tag=")
						append(it.key)
					}
				}
			}
		}
		return parseMangaList(webClient.httpGet(url).parseHtml())
	}
}
