package org.dantassz.yukitsu.parsers.site.madara.zh

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("BAKAMH", "Bakamh", "zh")
internal class Bakamh(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BAKAMH, "bakamh.com") {
	override val datePattern = "YYYY 年 M 月 d 日"
}
