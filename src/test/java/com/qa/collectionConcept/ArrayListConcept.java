package com.qa.collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<Object>();
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(10);
		for(int i=0;i<=5;i++)
		{
			al.add(i);
		}
		
		System.out.println(al);
		System.out.println("INDEX : "+al.get(5));
		
		al.add("Ram");
		System.out.println(al.size());
		System.out.println(al);
		
		// Retrieve the ArayList element:
		System.out.println("1. By Using simple for loop: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("2. By Using Extende for looop i.e. for-each loop: ");
		for(Object var :  al)
		{
			System.out.println(var);
		}
		
		System.out.println("3. By Using Iterator: ");
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
