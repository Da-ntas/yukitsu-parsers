package org.dantassz.yukitsu.parsers

import org.dantassz.yukitsu.parsers.config.ConfigKey
import org.dantassz.yukitsu.parsers.config.MangaSourceConfig

internal class SourceConfigMock : MangaSourceConfig {

	override fun <T> get(key: ConfigKey<T>): T = key.defaultValue
}
