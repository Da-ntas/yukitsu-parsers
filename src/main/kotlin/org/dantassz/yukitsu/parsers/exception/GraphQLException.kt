package org.dantassz.yukitsu.parsers.exception

import okio.IOException
import org.json.JSONArray
import org.dantassz.yukitsu.parsers.InternalParsersApi
import org.dantassz.yukitsu.parsers.util.json.mapJSONNotNull

public class GraphQLException @InternalParsersApi constructor(errors: JSONArray) : IOException() {

	public val messages: List<String> = errors.mapJSONNotNull {
		it.getString("message")
	}

	override val message: String
		get() = messages.joinToString("\n")
}
