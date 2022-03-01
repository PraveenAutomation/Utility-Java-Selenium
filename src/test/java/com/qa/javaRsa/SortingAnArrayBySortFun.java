package com.qa.javaRsa;

import java.util.Arrays;

public class SortingAnArrayBySortFun {

	public static void main(String[] args) {
		
		int a[] = {10,2,3,44,5,6,8,9,7,23,47,99,100};
		
		Arrays.sort(a);
		
		//System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
