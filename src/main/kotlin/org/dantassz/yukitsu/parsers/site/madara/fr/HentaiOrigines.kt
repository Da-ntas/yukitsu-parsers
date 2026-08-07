package org.dantassz.yukitsu.parsers.site.madara.fr

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("HENTAIORIGINES", "HentaiOrigines", "fr", ContentType.HENTAI)
internal class HentaiOrigines(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAIORIGINES, "hentai-origines.fr")
