package org.dantassz.yukitsu.parsers.site.mangareader.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ORIGAMIORPHEANS", "Origami Orpheans", "pt")
internal class Origamiorpheans(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.ORIGAMIORPHEANS,
		"origami-orpheans.com",
		pageSize = 20,
		searchPageSize = 10,
	)
