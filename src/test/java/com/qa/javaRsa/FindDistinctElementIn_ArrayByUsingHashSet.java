package com.qa.javaRsa;

import java.util.HashSet;

public class FindDistinctElementIn_ArrayByUsingHashSet {

	public static void main(String[] args) {
		int arr[]= {1,4,5,2,1,4,7,8,9,6,3,2,5,8};
		printDistinct(arr);

	}

	private static void printDistinct(int[] arr) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!hs.contains(arr[i]))
			{
				hs.add(arr[i]);
				System.out.print(arr[i]+" ");
			}
		}
		
	}



}
