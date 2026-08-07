package org.dantassz.yukitsu.parsers.site.madara.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAROCKTEAM", "MangaRock.team", "en")
internal class MangaRockTeam(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAROCKTEAM, "mangarockteam.com")
