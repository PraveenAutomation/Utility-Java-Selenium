package com.qa.javaException10Hrs;

public class Multiple_Try_Catch {

	public static void main(String[] args) {
		try
		{
			System.out.println("Try");
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		finally {
			System.out.println("Finally block");
		}

	}

}
