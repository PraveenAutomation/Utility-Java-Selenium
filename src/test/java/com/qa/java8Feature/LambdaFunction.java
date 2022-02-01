package com.qa.java8Feature;

public class LambdaFunction {
	
	@FunctionalInterface
	interface Interf
	{
		public void m1();
	}

	public static void main(String[] args) {
		Interf i=	()->
			System.out.println("Hello Lambda");
			i.m1();

	}

}
