package org.dantassz.yukitsu.parsers.site.zeistmanga.id

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("NIMEMOB", "Nimemob", "id")
internal class Nimemob(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.NIMEMOB, "www.nimemob.my.id")
