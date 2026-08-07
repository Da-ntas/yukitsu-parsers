package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("TEENMANHUA", "TeenManhua", "en")
internal class TeenManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TEENMANHUA, "teenmanhua.com") {
	override val datePattern = "dd/MM/yyyy"
}
