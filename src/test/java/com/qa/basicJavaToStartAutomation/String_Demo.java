package com.qa.basicJavaToStartAutomation;

public class String_Demo {

	public static void main(String[] args) {
		
		// string is an object {String is a final class}
		
		// String literals
		String s1="Software";
		String s2="Testing";
		
		
		// By using new keyword
		String s3=new String("Selenium");
		String s4=new String("Automation");
		
		String s5="Software Testing Automation Selenium";
		
		//Split by space		
		String[] s5Splitted=s5.split(" ");
		System.out.println(s5Splitted[0]);
		System.out.println(s5Splitted[2]);
		
		//Split by space
		String s6="Software Test Automation Selenium , Java";
		String[] s6Splitted=s6.split("Test");
		System.out.println(s6Splitted[1].trim());
		
		//Print all character
		System.out.println("****************************");
		System.out.println(" ");
		for(int i=0;i<s6.length();i++)
		{
			System.out.print(s6.charAt(i)+" ");
		}
		
		// To print reverse string -->Interview question
		System.out.println(" ");
		for(int i=s6.length()-1;i>=0;i--)
		{
			System.out.print(s6.charAt(i)+" ");
		}

	}}
