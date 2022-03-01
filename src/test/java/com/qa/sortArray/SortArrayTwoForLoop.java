package com.qa.sortArray;

import java.util.Arrays;

public class SortArrayTwoForLoop {

	public static void main(String[] args) {
		//int a[]= {100,55,78,110,45,10,23,56,54,70,3};
		int a[]={10,44,11,22,55,333,31,38,90,99,101};
		sortArray(a);
		System.out.println(Arrays.toString(a));

	}

	private static void sortArray(int[] a) {
		int temp=0;
		System.out.println("Sorted Arrays: ");
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
			System.out.print(" "+a[i]);
		}
		
	}

}
