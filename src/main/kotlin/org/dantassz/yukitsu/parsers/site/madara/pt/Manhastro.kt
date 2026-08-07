package org.dantassz.yukitsu.parsers.site.madara.pt

import org.jsoup.nodes.Document
import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.model.Manga
import org.dantassz.yukitsu.parsers.model.MangaChapter
import org.dantassz.yukitsu.parsers.model.MangaPage
import org.dantassz.yukitsu.parsers.model.MangaParserSource
import org.dantassz.yukitsu.parsers.site.madara.MadaraParser
import org.dantassz.yukitsu.parsers.util.generateUid
import org.dantassz.yukitsu.parsers.util.mapChapters
import org.dantassz.yukitsu.parsers.util.parseHtml
import org.dantassz.yukitsu.parsers.util.selectFirstOrThrow
import org.dantassz.yukitsu.parsers.util.toAbsoluteUrl
import org.dantassz.yukitsu.parsers.util.toRelativeUrl

@MangaSourceParser("MANHASTRO", "Manhastro", "pt")
internal class Manhastro(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHASTRO, "manhastro.net", 24) {

	override val listUrl = "lermanga/"
	override val tagPrefix = "genre/"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()

		val script = doc.selectFirstOrThrow("script:containsData(imageLinks)").data()
		val images = script.substringAfter('[').substringBeforeLast(']')
			.replace("\"", "").split(',')
		return images.map { img ->
			val url = context.decodeBase64(img).toString(Charsets.UTF_8)
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}

	override suspend fun getChapters(manga: Manga, doc: Document): List<MangaChapter> {
		val initialChapters = super.getChapters(manga, doc)

		if (initialChapters.isEmpty()) {
			return initialChapters
		}

		// Use the URL of the first (latest) chapter to fetch the chapter page.
		val firstChapterUrl = initialChapters.first().url.toAbsoluteUrl(domain)
		val chapterPageDoc = webClient.httpGet(firstChapterUrl).parseHtml()

		// Select all <option> elements from the chapter selection dropdown.
		val options = chapterPageDoc.select("select.single-chapter-select option")

		if (options.isNotEmpty()) {
			// The dropdown list is newest-to-oldest
			return options.mapChapters(reversed = true) { i, option ->
				val href = option.attr("data-redirect").toRelativeUrl(domain)
				val name = option.text().trim()

				MangaChapter(
					id = generateUid(href),
					url = href,
					title = name,
					number = i + 1f,
					volume = 0,
					uploadDate = 0L, // Date is not available in the dropdown
					source = source,
					scanlator = null,
					branch = null,
				)
			}
		}

		// If the dropdown wasn't found for some reason, return the initial (short) list as a fallback.
		return initialChapters
	}
}
