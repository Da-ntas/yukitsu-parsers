package org.dantassz.yukitsu.parsers.site.keyoapp.ar

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("SCANS4U", "4uScans", "ar")
internal class Scans4u(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.SCANS4U, "4uscans.com")
