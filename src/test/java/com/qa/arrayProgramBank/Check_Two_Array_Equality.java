package com.qa.arrayProgramBank;

public class Check_Two_Array_Equality {

	public static void main(String[] args) {
		int[] arr1= {10,20,30,40};
		int[] arr2= {10,20,30};
		
		boolean isEqual=true;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					isEqual=false;
					break;
				}
			}
		}
		else
			isEqual=false;
		
		if(isEqual)
			System.out.println("Arrays are Equals");
		else
			System.out.println("Arrays are not Equals");

	}

}
