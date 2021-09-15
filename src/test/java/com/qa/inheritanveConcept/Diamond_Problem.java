package com.qa.inheritanveConcept;

public class Diamond_Problem  {

	public static void main(String[] args) {
		Diamond_Problem d=new Diamond_Problem();
		//d.display();
	}
	
	class A
	{
		public void display()
		{
			System.out.println("class A display() method called");
		}
	}
	
	class B extends A
	{
		public void display()
		{
			System.out.println("class B display() method called");
		}
	}
	class C extends A
	{
		public void display()
		{
			System.out.println("class C display() method called");
		}
	}

}
