package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("TREE_MANGA", "TreeManga", "en")
internal class TreeManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TREE_MANGA, "treemanga.com") {
	override val datePattern = "MM/dd/yyyy"
}
