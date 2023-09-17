package com.qa.encapsulationDemo;

public class Account2 {
	
	private long ac_no;
	private String name, email;
	private float amount;
	
	public long getAcc_no()
	{
		return ac_no;
	}
	
	public void setAcc_no(long ac_no)
	{
		this.ac_no = ac_no;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getEmail(String email)
	{
		return email;
	}
	
	public void setEmail()
	{
		this.email=email;
	}
	
	public float getAmount()
	{
		return amount;
	}
	
	public void setAmount(float amount)
	{
		this.amount=amount;
	}

}
