package org.dantassz.yukitsu.parsers.site.en.mtl

import org.dantassz.yukitsu.parsers.Broken
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.model.ContentType

@Broken
@MangaSourceParser("SNOWMTL", "SnowMTL", "en", type = ContentType.OTHER)
internal class SnowMTL(context: MangaLoaderContext):
    MTLParser(context, source = MangaParserSource.SNOWMTL, "snowmtl.ru")
