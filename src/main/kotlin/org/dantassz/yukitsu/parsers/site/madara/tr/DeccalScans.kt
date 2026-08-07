package org.dantassz.yukitsu.parsers.site.madara.tr

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("DECCALSCANS", "DeccalScans", "tr", ContentType.HENTAI)
internal class DeccalScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DECCALSCANS, "fuchscans.com") {
	override val tagPrefix = "turler/"
}
