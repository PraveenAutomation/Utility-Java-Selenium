package com.qa.sortArray;

import java.util.Arrays;
import java.util.Collections;

public class SortArray_In_DescendingOrder {

	public static void main(String[] args) {
		Integer arr[]= {11,101,-10,20,78,44,55,19};
		sortArrayInDescendingOrder(arr);

	}

	private static void sortArrayInDescendingOrder(Integer[] arr) {
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Elements are: "+Arrays.toString(arr));
		
	}

}
