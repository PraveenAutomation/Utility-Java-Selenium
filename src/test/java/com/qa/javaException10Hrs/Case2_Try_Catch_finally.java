package com.qa.javaException10Hrs;

public class Case2_Try_Catch_finally {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Try");
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}

	}

}
