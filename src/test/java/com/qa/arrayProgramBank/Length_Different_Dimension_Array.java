package com.qa.arrayProgramBank;

public class Length_Different_Dimension_Array {

	public static void main(String[] args) {
		// Length & display of 1-D Array :
		int a[]= {10,20,11,14,12,30,40,50,44,41,42,43};
		int l1=a.length;
		System.out.println("Length of 1-D array: "+l1);
		// display of 1-D Array:
		for(int i=0;i<l1;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		// Length & display of N-D Array :
		int b[][]= {{10,20},{11,22},{55,44,77}};
		int l2=b.length;
		System.out.println();
		System.out.println("Lenghth og N-D Array: "+l2);
		System.out.println("At 0 index: "+b[0].length);
		System.out.println("At 1 index: "+b[1].length);
		System.out.println("At 2 index: "+b[2].length);
		// display array length
		System.out.print("The length of the given array = ");
		System.out.println(b.length);
		for(int i=0; i<b.length; i++) {
		  System.out.println("arr["+ i +"] length = " + b[i].length);
		}
		
		// Display an array:
		System.out.println("Display ===========");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]+" ");
			}
		}

	}

}
