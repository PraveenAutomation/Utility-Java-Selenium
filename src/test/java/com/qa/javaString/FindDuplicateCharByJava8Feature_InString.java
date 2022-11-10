package com.qa.javaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharByJava8Feature_InString {

	public static void main(String[] args) {
		String s="beautifule beach";
		duplicateChar(s);

	}

	private static void duplicateChar(String ip) {
		Map<Character,Integer> op=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<ip.length();i++)
		{
			char ch=ip.charAt(i);
			
		}
	}
	
}
