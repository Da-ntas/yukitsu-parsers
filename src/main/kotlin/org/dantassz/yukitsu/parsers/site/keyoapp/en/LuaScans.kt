package org.dantassz.yukitsu.parsers.site.keyoapp.en

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("LUASCANS", "luaComic.net", "en")
internal class LuaScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.LUASCANS, "luacomic.org")
