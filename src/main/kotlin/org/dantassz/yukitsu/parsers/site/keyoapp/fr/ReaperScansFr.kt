package org.dantassz.yukitsu.parsers.site.keyoapp.fr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("REAPERSCANS_FR", "ReaperScans.fr", "fr")
internal class ReaperScansFr(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.REAPERSCANS_FR, "reaper-scans.fr")
