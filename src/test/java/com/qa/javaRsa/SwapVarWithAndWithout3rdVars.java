package com.qa.javaRsa;

public class SwapVarWithAndWithout3rdVars {

	public static void main(String[] args) {
		
		int a=3;
		int b=4;
		//With using 3rd variables:
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Using 3rd vars: ");
		System.out.println("value of a is : "+a+" & "+"value of b is : "+b);
		
		//Without using 3rd variables:
		a=a+b;//7
		b=a-b;//3
		a=a-b;//4
		System.out.println("Without Using 3rd vars: ");
		System.out.println("value of a is : "+a+" & "+"value of b is : "+b);

	}

}
