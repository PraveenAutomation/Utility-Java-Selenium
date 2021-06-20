package com.qa.sortArray;

import java.util.Arrays;

public class SortArrayOneForLoop {

	public static void main(String[] args) {
		int a[]= {11,2,36,55,78,99,88,101,65};
		sortArray(a);
		System.out.println("Array is sorted: "+Arrays.toString(a));
		

	}

	private static int[] sortArray(int[] a) {
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=i-1;
			}
		}
		return a;
		
	}

}
