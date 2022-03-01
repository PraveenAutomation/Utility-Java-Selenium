package com.qa.stringJ67;

import org.apache.commons.lang3.StringUtils;

public class CountOccurrencesChar_ByStringUtils {

	public static void main(String[] args) {
		String s="VDSS TECHS LABS is softwares";
		countOccurrencesChar(s);

	}

	private static void countOccurrencesChar(String s) {
		char c='s';
		int count=StringUtils.countMatches(s, c);
		System.out.println(count);
		
		
	}

}
