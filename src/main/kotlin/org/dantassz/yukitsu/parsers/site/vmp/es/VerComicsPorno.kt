package org.dantassz.yukitsu.parsers.site.vmp.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.vmp.VmpParser

// Other domain name : toonx.net
@MangaSourceParser("VERCOMICSPORNO", "VerComicsPorno", "es", ContentType.HENTAI)
internal class VerComicsPorno(context: MangaLoaderContext) :
	VmpParser(context, MangaParserSource.VERCOMICSPORNO, "vercomicsporno.com") {
	override val listUrl = "comics-porno/"
	override val geneUrl = "etiquetas/"
}
