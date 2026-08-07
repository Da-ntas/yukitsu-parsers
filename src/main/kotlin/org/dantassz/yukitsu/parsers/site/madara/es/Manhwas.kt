package org.dantassz.yukitsu.parsers.site.madara.es

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAS_ES", "Manhwas.es", "es", ContentType.HENTAI)
internal class Manhwas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAS_ES, "manhwas.es", 30)
