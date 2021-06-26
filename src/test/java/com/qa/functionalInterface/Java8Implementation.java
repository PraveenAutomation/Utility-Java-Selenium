package com.qa.functionalInterface;

public class Java8Implementation {

	public static void main(String[] args) {
		
		Java8FunctionalInterface fi=()->System.out.println("Display Method implementation!!");
		fi.display();
		
		Calculator cal=(a,b)->a+b;
		System.out.println(cal.calculate(10,20));

	}

}
