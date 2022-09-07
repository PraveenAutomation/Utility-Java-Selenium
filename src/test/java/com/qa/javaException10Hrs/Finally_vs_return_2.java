package com.qa.javaException10Hrs;

public class Finally_vs_return_2 {

	public static void main(String[] args) {
		
		System.out.println(m1());


	}
	
	public static int m1()
	{
		try
		{
			return 777;
		}
		catch(ArithmeticException e)
		{
			return 888;
		}
		finally
		{
			return 999;
		}

	}

}
