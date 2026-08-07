package org.dantassz.yukitsu.parsers.site.ru.grouple

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.config.ConfigKey
import org.dantassz.yukitsu.parsers.model.MangaParserSource

@MangaSourceParser("MINTMANGA", "MintManga", "ru")
internal class MintMangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.MINTMANGA, 2) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	override fun getRequestHeaders() = super.getRequestHeaders().newBuilder()
		.add("referer", "https://$domain/")
		.build()

	companion object {

		val domains = arrayOf(
			"2.mintmanga.one",
			"24.mintmanga.one",
			"mintmanga.live",
			"mintmanga.com",
		)
	}
}
