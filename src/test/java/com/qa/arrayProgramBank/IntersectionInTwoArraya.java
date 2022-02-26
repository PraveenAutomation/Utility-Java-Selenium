package com.qa.arrayProgramBank;

public class IntersectionInTwoArraya {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70};
		int b[]= {10,20,80,90,100,50,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}

	}
	

}
