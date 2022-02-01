package com.qa.javaString;

final class Immutableclass {
	private int a;
	


	Immutableclass(int a)
	{
		this.a=a;
	}
	
	
	public Immutableclass modify(int a)
	{
		if(this.a==a)
		{
			return this;
		}
		else
		{
			return new Immutableclass(a);
		}
		
	}


	public static void main(String[] args) {
		Immutableclass ic=new Immutableclass(10);
		Immutableclass ic1=ic.modify(20);
		Immutableclass ic2=ic.modify(10);
		System.out.println(ic.a);
		System.out.println(ic==ic1);
		System.out.println(ic==ic2);
		

	}

}
