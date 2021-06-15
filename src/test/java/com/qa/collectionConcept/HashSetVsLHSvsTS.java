package com.qa.collectionConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetVsLHSvsTS {

	public static void main(String[] args) {
		
		System.out.println("===========HASHSET==============");
		//HashSet did not maintain insertion order and does not allow duplicate:
		Set<String> hs=new HashSet<String>();
		hs.add("One-1");
		hs.add("Two-2");
		hs.add("Three-3");
		hs.add("Four-4");
		hs.add("Five-5");
		hs.add("Six-6");
		hs.add("Seven-7");
		hs.add("Eight-8");
		
		System.out.println(hs);
		for(String s : hs)
		{
			System.out.println(s);
		}
		
		System.out.println("===========LINKEDHASHSET==============");

		//LinkedHashSet did maintain insertion order and does not allow duplicate:
		Set<String> lhs=new LinkedHashSet<String>();
		lhs.add("One-1");
		lhs.add("Two-2");
		lhs.add("Three-3");
		lhs.add("Four-4");
		lhs.add("Five-5");
		lhs.add("Six-6");
		lhs.add("Seven-7");
		lhs.add("Eight-8");
		
		System.out.println(lhs);
		for(String s : lhs)
		{
			System.out.println(s);
		}
		
		System.out.println("===========TREESET==============");
		//LinkedHashSet did maintain insertion order and does not allow duplicate:
		Set<String> ts=new TreeSet<String>();
		ts.add("One-1");
		ts.add("Two-2");
		ts.add("Three-3");
		ts.add("Four-4");
		ts.add("Five-5");
		ts.add("Six-6");
		ts.add("Seven-7");
		ts.add("Eight-8");
		
		System.out.println(ts);
		for(String s : ts)
		{
			System.out.println(s);
		}

	}

}
