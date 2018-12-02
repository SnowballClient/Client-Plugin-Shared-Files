package org.golde.snowball.shared.util;

import java.util.regex.Pattern;

public class StringHelper {

	private static final Pattern FORMATTING_CODE_PATTERN = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");
	public static String sanatise(String in) {
		return FORMATTING_CODE_PATTERN.matcher((in.toLowerCase().replaceAll("[\\d-]", "").replace("-", "").replace("_", "").replace(" ", ""))).replaceAll("");
	}
	
}
