package com.qa.coreLogic;

import java.util.Arrays;

public class ArrayIn_Max_Min_Form {
	
	static void rearrange(int arr[], int n)
	{
		//Auxiliary array To Hold modified array
		int temp[]=arr.clone();
		
		// Indexes of smallest & Largest array:
		int small=0,large=n-1;
		
		boolean flag=true;
		
		//Store result in temp[]:
		for(int i=0;i<n;i++)
		{
			if(flag)
				arr[i]=temp[large--];
			else
				arr[i]=temp[small++];
			
			flag=!flag;
		}
	}

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6};
		
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		
		rearrange(arr,arr.length);
		
		System.out.println("Modified Array: ");
		System.out.println(Arrays.toString(arr));

	}

}
