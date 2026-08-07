package org.dantassz.yukitsu.parsers.site.mangareader.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaListFilterCapabilities
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MIHENTAI", "MiHentai", "id", ContentType.HENTAI)
internal class MiHentai(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MIHENTAI, "mihentai.com", pageSize = 30, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
	override val selectMangaList = ".listupd .bs .bsx"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
