package org.dantassz.yukitsu.parsers.site.cupfox.fr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.cupfox.CupFoxParser

@Broken
@MangaSourceParser("FRMANGA", "FrManga", "fr")
internal class FrManga(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.FRMANGA, "www.frmanga.com")
