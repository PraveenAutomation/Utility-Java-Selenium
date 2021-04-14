package com.qa.javaRsa;

import java.util.ArrayList;

public class CompareFromTwoSetOfArrayAndMakeNewArrayOfCommonElement {

	public static void main(String[] args) {
		int a []= {4,8,9,6,3};
		int b []= {4,5,2,3,3};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
		Object[] c=al.toArray();
		
		for(Object obj : c)
		{
			System.out.println(obj);
		}

	}

}
