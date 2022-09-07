package com.qa.javaException10Hrs;

public class Finally_vs_SystemExit_2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("try");
			System.exit(10);
		}
		catch (Exception e) 
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}

	}

}
