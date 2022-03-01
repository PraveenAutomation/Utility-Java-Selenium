package com.qa.javaRsa;

import java.util.Arrays;

public class SortingAnArrayWithTwoLoops {

	public static void main(String[] args) {
		
		int a[] = {1,8,3,9,5,4,7};
		int b[]= {5,7,8,9,3,4,1};
		Arrays.sort(b);
		int n=b.length;
		System.out.println(b[n-2]);
		sortArray(a);
		/*
		 * int temp=0; for(int i=0;i<a.length;i++) { for(int j=i+1;j<a.length;j++) {
		 * if(a[i]>a[j]) { temp=a[i]; a[i]=a[j]; a[j]=temp; } } } for(int
		 * i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */

	}


	private static void sortArray(int[] a) {
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}
			



