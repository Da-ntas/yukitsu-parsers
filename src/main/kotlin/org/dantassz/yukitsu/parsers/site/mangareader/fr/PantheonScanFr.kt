package org.dantassz.yukitsu.parsers.site.mangareader.fr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("PANTHEONSCAN_FR", "PantheonScan.fr", "fr")
internal class PantheonScanFr(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.PANTHEONSCAN_FR,
		"www.pantheon-scan.fr",
		pageSize = 40,
		searchPageSize = 10,
	)
