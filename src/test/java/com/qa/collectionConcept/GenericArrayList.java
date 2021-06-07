package com.qa.collectionConcept;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		
		for(int i=2;i<10;i++)
		{
			li.add(i);
		}
		//li.addAll(li);
		System.out.println(li);

	}

}
