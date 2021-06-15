package com.qa.retreat;

public class Sum_ByRecurrsion {

	public static void main(String[] args) {
		Sum_ByRecurrsion sr=new Sum_ByRecurrsion();
		System.out.println("Total sum is "+sr.sum(0, 10));

	}
	
	public int sum(int start, int end)
	{
		if(end>start)
		{
			return end+sum(start,end-1);
		}
		else
		{
			return end;
		}
	}

}
