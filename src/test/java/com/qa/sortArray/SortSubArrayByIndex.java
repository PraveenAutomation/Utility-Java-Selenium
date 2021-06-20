package com.qa.sortArray;

import java.util.Arrays;

public class SortSubArrayByIndex {

	public static void main(String[] args) {
		
		int a[]= {4,1,5,8,9,3,5,7,5,6,9};
		sortArrayByIndex(a,1,5);
		System.out.println("Sorted Array are: "+Arrays.toString(a));

	}

	private static void sortArrayByIndex(int[] a, int i, int j) {
		Arrays.sort(a,i,j);
		System.out.println("Sorted Array are: %s"+Arrays.toString(a));
		
	}

}
