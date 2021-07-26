package com.qa.sqtools;

public class SwapVariableWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10,b=20;
		swapVar(a,b);

	}

	private static void swapVar(int a, int b) {
		System.out.println("Value before swap of a="+a+" and of b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value After swap of a= "+a+ " and of b= "+b);
		
	}

}
