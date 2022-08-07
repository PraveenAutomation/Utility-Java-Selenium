package com.qa.javaString5Hrs;

import java.util.Scanner;

public class String_Trim_Scanner {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your city name: ");
		String name=sc.nextLine().toLowerCase().trim();
		if(name.equals("hyderabad"))
		{
			System.out.println("Hello Hydrabadi, Asdaab...");
		}
		else if(name.equals("Chennai"))
		{
			System.out.println("Hello Madrasi, Vanakkam...");
		}
		else if(name.equals("Banglore"))
		{
			System.out.println("Hello Kannnadinga, Namaskara...");
		}
		else
		{
			System.out.println("Please enter valid city name");
		}
		
		sc.close();
	}

}
