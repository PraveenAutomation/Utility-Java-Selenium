package com.qa.javaUtility;

public class AdditionByRecurssion {

	public static void main(String[] args) {
		System.out.println(addUptoTen(10));
		System.out.println(sumRange(5,10));

	}
	
	public static int addUptoTen(int k)
	{
		if(k>0)
		{
			return k+ addUptoTen(k-1);
		}
		else
		{
			return 0;
		}
	}
	
	public static int sumRange(int start, int end)
	{
		if(end>start)
			return end+sumRange(start, end-1);
			else
				return end;
		
	}

}
