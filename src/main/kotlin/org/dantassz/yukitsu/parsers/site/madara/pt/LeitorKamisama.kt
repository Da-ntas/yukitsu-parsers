package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LEITORKAMISAMA", "LeitorKamisama", "pt")
internal class LeitorKamisama(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LEITORKAMISAMA, "leitor.kamisama.com.br", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
