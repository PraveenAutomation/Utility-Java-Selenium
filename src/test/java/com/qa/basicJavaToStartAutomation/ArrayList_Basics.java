package com.qa.basicJavaToStartAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Basics {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Software");
		al.add("Testing");
		al.add("Automation");
		
		//al.remove(2);
		
		System.out.println(al.get(2));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("*******************");
		
		for(String s : al)
		{
			System.out.println(s);
		}
		
		// Convert array to arraylist
		String[] names= {"Software","Test","Automation","Selenium","Playwright"};
		List<String> listNames=Arrays.asList(names);
		//Check item is present or not:
		System.out.println(listNames.contains("Selenium1"));
		

	}

}
