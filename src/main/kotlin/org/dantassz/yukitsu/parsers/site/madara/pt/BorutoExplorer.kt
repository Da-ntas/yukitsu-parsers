package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("BORUTOEXPLORER", "BorutoExplorer", "pt")
internal class BorutoExplorer(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BORUTOEXPLORER, "leitor.borutoexplorer.com.br", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
