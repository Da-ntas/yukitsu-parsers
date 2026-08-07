package org.dantassz.yukitsu.parsers.exception

import okio.IOException
import org.dantassz.yukitsu.parsers.InternalParsersApi
import org.dantassz.yukitsu.parsers.model.MangaSource

/**
 * Authorization is required for access to the requested content
 */
public class AuthRequiredException @InternalParsersApi @JvmOverloads constructor(
	public val source: MangaSource,
	cause: Throwable? = null,
) : IOException("Authorization required", cause)
