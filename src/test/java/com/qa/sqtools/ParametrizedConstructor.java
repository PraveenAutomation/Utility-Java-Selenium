package com.qa.sqtools;

public class ParametrizedConstructor {
	int id;
	String Name;
	ParametrizedConstructor(int i, String name)
	{
		id=i;
		Name=name;
	}
	
	void display()
	{
		System.out.println("Student Id is: "+id);
		System.out.println("Student Name is: "+Name);
	}

	public static void main(String[] args) {
		ParametrizedConstructor pc=new ParametrizedConstructor(101, "VDS");
		ParametrizedConstructor pc1=new ParametrizedConstructor(102, "TECH");
		pc.display();
		pc1.display();
	}

}
