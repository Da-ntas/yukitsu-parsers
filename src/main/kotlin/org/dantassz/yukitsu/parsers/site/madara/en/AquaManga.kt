package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.Manga
import org.dantassz.yukitsu.parsers.model.MangaListFilter
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.model.SortOrder
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("AQUAMANGA", "AquaManga", "en")
internal class AquaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.AQUAMANGA, "aquareader.org", 20) {

    override suspend fun getListPage(page: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
        return super.getListPage(
            page,
            order = order.takeUnless { it == SortOrder.RELEVANCE } ?: SortOrder.NEWEST,
            filter
        )
    }
}
