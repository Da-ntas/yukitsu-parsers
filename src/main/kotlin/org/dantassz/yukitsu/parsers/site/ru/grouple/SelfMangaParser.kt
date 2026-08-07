package org.dantassz.yukitsu.parsers.site.ru.grouple

import org.dantassz.yukitsu.parsers.MangaLoaderContext
import org.dantassz.yukitsu.parsers.MangaSourceParser
import org.dantassz.yukitsu.parsers.config.ConfigKey
import org.dantassz.yukitsu.parsers.model.ContentType
import org.dantassz.yukitsu.parsers.model.MangaParserSource

@MangaSourceParser("SELFMANGA", "SelfManga", "ru", type = ContentType.OTHER)
internal class SelfMangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.SELFMANGA, 3) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	override fun getRequestHeaders() = super.getRequestHeaders().newBuilder()
		.add("referer", "https://$domain/")
		.build()

	companion object {

		val domains = arrayOf(
			"selfmanga.live",
		)
	}
}
