package org.dantassz.yukitsu.parsers.site.madtheme.en

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("TOONITUBE", "TooniTube", "en", ContentType.HENTAI)
internal class TooniTube(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.TOONITUBE, "toonitube.com") {
	override val selectDesc = "div.summary div.section-body p.content"
}
