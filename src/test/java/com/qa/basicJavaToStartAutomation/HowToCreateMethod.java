package com.qa.basicJavaToStartAutomation;

public class HowToCreateMethod {

	public static void main(String[] args) {
		
		HowToCreateMethod hc=new HowToCreateMethod();
		hc.name();
		hc.name1("Automation");
		hc.sum(5, 10);
		revString("Software");
		
		

	}
	
	public void name()
	{
		System.out.println("Software Testing");
	}
	
	public String name1(String name)
	{
		System.out.println(name);
		return name;
	}
	
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum is : "+c);
	}
	
	public static void revString(String s)
	{
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
	}

}
