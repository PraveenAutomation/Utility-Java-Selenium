package com.qa.encapsulationDemo;

public class MainAccount {

	public static void main(String[] args) {
		
		Account ac = new Account();
		ac.setAccNo(45789654);
		System.out.println(ac.getAccNo());
		
		ac.setName("VDS");
		System.out.println(ac.getName());
		
		ac.setEmail("abc@gmail.com");
		System.out.println(ac.getEmail());
		
		ac.setAmount(478.33f);
		System.out.println(ac.getAmount());
		

	}

}
