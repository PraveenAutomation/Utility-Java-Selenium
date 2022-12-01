package com.qa.arrayMinMax;

public class Array_MinMax {

	public static void main(String[] args) {
		
		int arr[]= {7,9,5,4,8,10,14,5,6,3,25};
		
		int max= getMax(arr);
		int min= getMin(arr);

		System.out.println("Max value is "+max+" & "+"Min value is "+min);
	}

	private static int getMin(int[] arr) {
		
		int minValue = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<minValue)
			{
				minValue=arr[i];
			}
		}
		return minValue;
	}

	private static int getMax(int[] arr) {
		
		int maxValue=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxValue)
			{
				maxValue=arr[i];
			}
		}
		return maxValue;
		
	}
	
	

}
