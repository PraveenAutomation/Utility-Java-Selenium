package com.qa.arrayProgramBank;

public class Jagged_Array {

	public static void main(String[] args) {
		//Jagged Array:
		int a[][]= {{10,20},{11,12,13},{12},{45,41}};
		//Length:
		int l=a.length;
		System.out.println("Length of Jagged Array: "+l);
		//Printing element:
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
