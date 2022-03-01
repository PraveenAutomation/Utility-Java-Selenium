package com.qa.retreat;

public class AdjacentDiffOfAnArray {

	public static void main(String[] args) {
		int[] a= {10,78,12,45,65,58,99};
		int res=ajacenDiff(a);
		System.out.println(res);

	}

	private static int ajacenDiff(int[] a) {
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
