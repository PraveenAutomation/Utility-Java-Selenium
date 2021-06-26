package com.qa.sortArray;

import java.util.Arrays;

public class SortArrayBySortMethod__2 {

	public static void main(String[] args) {
		
		int [] a= {4,5,7,8,2,1,4,5,111,2,11,30};
		sortArray(a);

	}

	private static void sortArray(int[] a) {
		Arrays.sort(a);
		System.out.println("Element are in Sorted ways: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}
