package com.qa.controlFlow;

public class IfElse_ladder {

	public static void main(String[] args) {
		
		String city="Delhi";
		
		if(city=="Meerut")
		{
			System.out.println("City is Meerut");
		}
		if(city=="LKO")
		{
			System.out.println("City is LKO");
		}
		
		else if(city=="Noida")
		{
			System.out.println("City is Noida");
		}
		else if(city=="GZB")
		{
			System.out.println("City is GZB");
		}
		else if(city=="Aligarh")
		{
			System.out.println("City is ALigarh");
		}
		else
		{
			System.out.println("City is "+city);
		}


	}

}
