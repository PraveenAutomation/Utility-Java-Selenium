package com.qa.javaUtility;

public class WrapperClasses {

	
	public static void main(String[] args) {
		
		WrapperClasses wc=new WrapperClasses();
		Integer i=new Integer(5);
		Integer j=new Integer(3);
	
		Integer obj = Integer.valueOf(1024);
		int c=10;
		int d=11;
		
		System.out.println(wc.addPrimitive(i, j));
		System.out.println(wc.addObject(c,d));
		
	}
	
	public int addPrimitive(int i,int j)
	{
		return i+j;
	}
	
	public int addObject(Integer a, Integer b)
	{
		return a+b;
	}

}
