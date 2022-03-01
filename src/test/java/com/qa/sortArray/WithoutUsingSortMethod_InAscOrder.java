package com.qa.sortArray;

public class WithoutUsingSortMethod_InAscOrder {

	public static void main(String[] args) {
		int[] arrNum= {11,10,8,5,50,44,12,3,300};
		sortArrayWithoutSortMethod_InAsc(arrNum);

	}

	private static void sortArrayWithoutSortMethod_InAsc(int[] arrNum) {
		int temp;
		System.out.println("Before sort: ");
		for(int num : arrNum)
		{
			System.out.print(num+" ");
		}
		for(int i=0;i<arrNum.length;i++)
		{
			for(int j=i+1;j<arrNum.length;j++)
			{
				if(arrNum[i]>arrNum[j])
				{
					temp=arrNum[i];
					arrNum[i]=arrNum[j];
					arrNum[j]=temp;
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
