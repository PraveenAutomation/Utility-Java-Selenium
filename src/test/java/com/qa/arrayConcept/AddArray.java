package com.qa.arrayConcept;

public class AddArray {

	public static void main(String[] args) {
		int a[]= {4,5,7,8,9,6};
		
		addArray(a);
		addArray1(a);

	}

	private static void addArray(int[] a) {
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	
	private static void addArray1(int[] a) {
		
		int sum=0;
		for(int x : a)
		{
			sum=sum+x;
		}
		System.out.println(sum);
	}


}
