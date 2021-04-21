package com.qa.durgaJavaOops;

public class AutomaticTypePromotionInOverloading4 {

	public static void main(String[] args) {
		
		AutomaticTypePromotionInOverloading4 t=new AutomaticTypePromotionInOverloading4();
		t.m1();
		t.m1(10,20);
		t.m1(10);

	}
	
	public void m1(int i)
	{
		System.out.println("General method");
	}
	
	public void m1(int... i)
	{
		System.out.println("Var-args method");
	}

}
