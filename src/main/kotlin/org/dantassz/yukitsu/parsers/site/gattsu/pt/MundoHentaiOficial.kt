package org.dantassz.yukitsu.parsers.site.gattsu.pt

import org.jsoup.nodes.Document
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.*
import org.dantassz.yukitsu.parsers.site.gattsu.GattsuParser
import org.dantassz.yukitsu.parsers.util.attrAsAbsoluteUrl
import org.dantassz.yukitsu.parsers.util.generateUid
import org.dantassz.yukitsu.parsers.util.selectLastOrThrow
import org.dantassz.yukitsu.parsers.util.src

@MangaSourceParser("MUNDOHENTAIOFICIAL", "MundoHentaiOficial", "pt", ContentType.HENTAI)
internal class MundoHentaiOficial(context: MangaLoaderContext) :
	GattsuParser(context, MangaParserSource.MUNDOHENTAIOFICIAL, "mundohentaioficial.com") {

	override val tagUrl = "tags"

	override fun parseMangaList(doc: Document): List<Manga> {
		return doc.select("div.lista ul li, div.videos div.video").mapNotNull { li ->
			val a = li.selectLastOrThrow("a")
			val href = a.attrAsAbsoluteUrl("href")
			if (!href.contains(domain)) {
				//Some sources include ads in manga lists
				return@mapNotNull null
			}
			Manga(
				id = generateUid(href),
				url = href,
				publicUrl = href,
				title = li.selectLastOrThrow(".thumb-titulo, .video-titulo").text(),
				coverUrl = li.selectFirst("img")?.src(),
				altTitles = emptySet(),
				rating = RATING_UNKNOWN,
				tags = emptySet(),
				description = null,
				state = null,
				authors = emptySet(),
				contentRating = if (isNsfwSource) ContentRating.ADULT else null,
				source = source,
			)
		}
	}
}
