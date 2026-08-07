package org.dantassz.yukitsu.parsers.site.gallery.vi

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.config.ConfigKey
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.site.gallery.GalleryParser

@MangaSourceParser("BUONDUA", "Buon Dua", "vi", type = ContentType.OTHER)
internal class BuonDua(context: MangaLoaderContext) :
    GalleryParser(context, MangaParserSource.BUONDUA, "buondua.com") {

    override val configKeyDomain: ConfigKey.Domain = ConfigKey.Domain(
        "buondua.com",
        "buondua.us",
    )
}
