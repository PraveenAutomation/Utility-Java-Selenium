package com.qa.arrayMinMax;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FIndDuplicateInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(5);
		al.add(3);
		al.add(10);
		al.add(15);
		
		Set<Integer> s=new HashSet<>();
		
		for(int num : al)
		{
			System.out.println(num);
			if(s.add(num)==false)
				System.out.println(num);
			
		}
		

	}
	


}
