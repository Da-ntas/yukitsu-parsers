package org.dantassz.yukitsu.parsers.site.ru.grouple

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.config.ConfigKey
import org.dantassz.yukitsu.parsers.model.MangaParserSource

@MangaSourceParser("SEIMANGA", "SeiManga", "ru")
internal class SeiMangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.SEIMANGA, 21) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	override fun getRequestHeaders() = super.getRequestHeaders().newBuilder()
		.add("referer", "https://$domain/")
		.build()

	companion object {

		val domains = arrayOf(
			"1.seimanga.me",
			"seimanga.me",
		)
	}
}
