package org.dantassz.yukitsu.parsers.site.mmrcms.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@MangaSourceParser("SCANVF", "ScanVf", "fr")
internal class ScanVf(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.SCANVF, "www.scan-vf.net") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
