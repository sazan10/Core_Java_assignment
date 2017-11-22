package com.Assignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
	private String pat = "(\\w*\\.)*(.*\\.\\w*){1}";
	private Pattern rat = Pattern.compile(pat);
	private String url = null;

	public String regex(Companies p) {
		Matcher mat = rat.matcher(p.getWeburl());
		if (mat.find())
		{
			url = mat.group(2);
		}
		return url;
	}
}
