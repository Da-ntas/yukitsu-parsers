package org.dantassz.yukitsu.parsers.site.pizzareader.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("HNISCANTRAD", "HniScantrad", "fr")
internal class HniScantrad(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.HNISCANTRAD, "hni-scantrad.net") {
	override val ongoingFilter = "en cours"
	override val completedFilter = "terminé"
}
