package com.qa.sortArray;

import java.util.Arrays;

public class SortArrayBySortMethod {

	public static void main(String[] args) {
		
		int a[]= {10,2,4,5,3,33,6,9,8,5,7,4,1};
		sortArray(a);

	}

	private static void sortArray(int[] a) {
		Arrays.sort(a);
		
		System.out.println("Sorted Value is : "+Arrays.toString(a));
		
	}

}
