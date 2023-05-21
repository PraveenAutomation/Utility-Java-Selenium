package com.qa.arrayDataStructure;

import java.util.Arrays;

public class InsertionSortingAlgo {
	
	public static void insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int current=arr[i];
			int j=i-1;
			while(j >=0 && arr[j] >current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		
		int arr[]= {8,4,1,2,3};
		
		insertionSort(arr);



	}

}
