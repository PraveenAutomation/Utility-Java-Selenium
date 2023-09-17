package com.qa.encapsulationDemo;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		Account2 a2 = new Account2();
		
		a2.setAcc_no(45789887);
		a2.setName("Raman");
		a2.setAmount(10000);
		
		System.out.println(a2.getAcc_no()+" "+a2.getName()+" "+a2.getAmount());
		

	}

}
