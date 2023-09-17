package com.qa.encapsulationDemo;

// Read Only class:

public class Student2 {
	
	private String college = "VDS";
	
	public String getCollege()
	{
		return college;
	}
	
	public static void main(String[] args) {
		
		Student2 s2 = new Student2();
		System.out.println(s2.getCollege());
		
	}

}
