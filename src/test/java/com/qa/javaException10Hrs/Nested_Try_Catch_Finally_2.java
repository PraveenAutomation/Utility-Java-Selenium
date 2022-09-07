package com.qa.javaException10Hrs;

public class Nested_Try_Catch_Finally_2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Outer Try bloc");
			try
			{
				System.out.println("Inner Try block");
				System.out.println(10/0);
			}
			catch(NullPointerException e)
			{
				System.out.println("inner catch block");
			}
			System.out.println("Outside of inner try catch block");
		}
		catch(Exception e)
		{
			System.out.println("outer catch block");
		}
		finally
		{
			System.out.println("Outer finally block");
		}

	}

}
