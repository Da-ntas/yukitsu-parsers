package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.Broken

@Broken
@MangaSourceParser("ARGOSCOMICS", "ArgosComics", "pt")
internal class ArgosComics(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARGOSCOMICS, "argoscomic.com")
