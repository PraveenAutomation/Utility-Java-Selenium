package com.qa.basicJavaToStartAutomation;

public class If_Else {

	public static void main(String[] args) {
		
		
		int[] marks= {10,20,14,45,44,5,6,8,9,74}; 
		
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]%2==0)
			{
				System.out.println(marks[i]+" Even");
			}
			else
			{
				System.out.println(marks[i]+" Odd");
			}
		}
		

	}

}
