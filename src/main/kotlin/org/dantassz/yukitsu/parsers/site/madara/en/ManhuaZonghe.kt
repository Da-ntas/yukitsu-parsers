package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAZONGHE", "ManhuaZonghe", "en")
internal class ManhuaZonghe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAZONGHE, "www.manhuazonghe.com") {
	override val tagPrefix = "genre/"
	override val listUrl = "manhua/"
}
