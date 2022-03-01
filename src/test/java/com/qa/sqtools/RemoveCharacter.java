package com.qa.sqtools;

public class RemoveCharacter {
	 
public static String removeChar(String str, char c) {
 
if (str == null)
 
return null;
 
return str.replaceAll(Character.toString(c), "");
 
}
 
public static void main(String[] args) {
 
System.out.println(removeChar("chicago", 'c'));
 
}
 
}
