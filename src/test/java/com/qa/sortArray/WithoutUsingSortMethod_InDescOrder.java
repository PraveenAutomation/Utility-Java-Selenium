package com.qa.sortArray;

public class WithoutUsingSortMethod_InDescOrder {

	public static void main(String[] args) {
		int[] arrNum= {11,10,8,5,50,44,12,3,300};
		sortArrayWithoutSortMethod_InDesc(arrNum);

	}

	private static void sortArrayWithoutSortMethod_InDesc(int[] arrNum) {
		int temp;
		System.out.println("Before Sort: ");
		for(int num : arrNum)
		{
			System.out.print(num+" ");
		}
		for(int i=0;i<=arrNum.length-1;i++)
		{
			for(int j=0;j<=arrNum.length-2;j++)
			{
				if(arrNum[j]<arrNum[j+1])
				{
					temp=arrNum[j];
					arrNum[j]=arrNum[j+1];
					arrNum[j+1]=temp;
					
				}
			}
		}
		System.out.println();
		System.out.println("After sort: ");
		for(int num : arrNum)
		{
			System.out.print(num+" ");
		}
		
	}

}
