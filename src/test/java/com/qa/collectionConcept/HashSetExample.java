package com.qa.collectionConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> se = new HashSet<String>();
		se.add("Ram");
		se.add("VDS");
		se.add("TECH");
		se.add("LABS");
		se.add("star");
		System.out.println(se);
		
		for(String s : se)
		{
			System.out.println(s);
		}
		
		Iterator itr=se.iterator();
		System.out.println("=============================");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		

	}

}
