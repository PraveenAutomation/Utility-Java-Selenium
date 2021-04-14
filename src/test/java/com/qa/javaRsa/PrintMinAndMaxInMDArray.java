package com.qa.javaRsa;

public class PrintMinAndMaxInMDArray {

	public static void main(String[] args) {
		int a[][]= {{2,4,5},{3,0,7},{1,2,9}};
		//int b[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int result=minArray(a);
		System.out.println(result);
		int result1=maxArray(a);
		System.out.println(result1);

	}
	
	public static int minArray(int[][] a) {
		int min=a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		return min;
	}
	
	public static int maxArray(int[][] a) {
		int max=a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		return max;
	}

	
}
