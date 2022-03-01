package com.qa.arrayProgramBank;

public class Find_Smallest_Elmnt_in_Array {

	public static void main(String[] args) {
		int a[]= {10,20,11,4,5,3,2,0,7,15};
		System.out.println(smallestElement(a));

	}

	private static int smallestElement(int[] a) {
		int min=0;
		min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
		
	}

}
