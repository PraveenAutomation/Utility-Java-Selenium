package com.qa.durgaJavaOops;

public class AutomaticTypePromotionInOverloading2 {

	public static void main(String[] args) {
		AutomaticTypePromotionInOverloading2 t=new AutomaticTypePromotionInOverloading2();
		
		t.m1(new Object());
		t.m1("VDS");
		t.m1(null);

	}
	
	public void m1(Object o)
	{
		System.out.println("Object Version");
	}
	
	public void m1(String s)
	{
		System.out.println("String version");
	}

}
