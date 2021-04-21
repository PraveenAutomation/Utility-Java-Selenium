package com.qa.durgaJavaOops;

public class VarArgConcept {

	public static void main(String[] args) {
		VarArgConcept v=new VarArgConcept();
		v.m1(10);
		v.m1(10,20,0);
		int res=sumNum(10,20,10);
		System.out.println(res);

	}
	
	public static int sumNum(int... args) {
		 int sum=0;
		 for(int x:args)
		 {
			 sum=sum+x;
		 }
		 return sum;
		 
		
	}

	public void m1(int... i)
	{
		System.out.println("var args");
	}
	


}
