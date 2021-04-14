package com.qa.javaRsa;

public class AdjacentArray {

	public static void main(String[] args) {
		int a[]= {5,10,6,9,10};
		int result= adjArrayDiff(a);
		System.out.println(result);

	}

	private static int adjArrayDiff(int[] a) {
		int diff=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]>diff)
			{
				diff=a[i+1]-a[i];
			}
		}
		return diff;
	}



}
