package com.qa.javaException10Hrs;

public class Finally_vs_return_1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Try");
			return;
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
