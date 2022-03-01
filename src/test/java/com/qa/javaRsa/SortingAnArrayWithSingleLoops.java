package com.qa.javaRsa;

import java.util.Arrays;

public class SortingAnArrayWithSingleLoops {
	


	public static void main(String[] args) {
		int[] arr= {4,2,1,7,8,3,6,11,10,5};
		sortArrays(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] sortArrays(int[] arr) {
		
		int len=arr.length;
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i=-1;
			}
		}
		return arr;
		
	}

}
