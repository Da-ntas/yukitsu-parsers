package org.dantassz.yukitsu.parsers.site.madara.pt

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("PRISMA_HENTAI", "PrismaHentai", "pt", ContentType.HENTAI)
internal class Prismahentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PRISMA_HENTAI, "prismahentai.com", 18)
