package org.dantassz.yukitsu.parsers.site.mangareader.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("VOIDSCANS_CO", "VoidScans", "en")
internal class VoidScansCo(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.VOIDSCANS_CO, "voidscans.co", pageSize = 30, searchPageSize = 42)
