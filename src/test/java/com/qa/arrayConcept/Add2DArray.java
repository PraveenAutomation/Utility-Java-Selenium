package com.qa.arrayConcept;

public class Add2DArray {

	public static void main(String[] args) {
		
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,4,7},{2,5,8},{3,6,9}};
		
		add2dArray(a,b);
		
		  String s1 = "abc";
		  String s2 = "abc";

		  System.out.println("s1 == s2 is:" + s1 == s2);
		

	}
	
	public static void add2dArray(int a[][],int b[][])
	{
		int c[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	

}
