package org.dantassz.yukitsu.parsers.site.madara.vi

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaChapter
import org.dantassz.yukitsu.parsers.model.MangaPage
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.util.*

@MangaSourceParser("QUAANHDAOCUTEO", "Quả Anh Đào Cuteo", "vi", ContentType.HENTAI)
internal class Quaanhdaocuteo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.QUAANHDAOCUTEO, "qadcuteo.cc") {
	override val datePattern = "dd/MM/yyyy"
	override val selectPage = "p img"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val root = doc.body().selectFirstOrThrow(selectBodyPage)
		return root.select(selectPage).map { img ->
			val url = img.requireSrc().toRelativeUrl(domain)
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}
}
