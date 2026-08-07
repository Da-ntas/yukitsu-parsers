package org.dantassz.yukitsu.parsers.site.zeistmanga.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.model.MangaTag
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("RAYSSCAN", "RaysScan", "pt")
internal class RaysScan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.RAYSSCAN, "raysscan.blogspot.com") {

	override suspend fun getFilterOptions() = super.getFilterOptions().copy(
		availableStates = emptySet(),
	)

	override suspend fun fetchAvailableTags(): Set<MangaTag> = emptySet()
}


