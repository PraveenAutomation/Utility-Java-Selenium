package com.qa.javaString;

public class StringBuffer_VS_StringBuilder_Performance {
	

	public static void main(String[] args) {
		
		// StringBuffer Test:
		StringBuffer sb = new StringBuffer("VDS");
		sb.append("TECH");
		System.out.println(sb);
		
		// StringBuilder Test:
		StringBuilder sbl = new StringBuilder("Java");
		sbl.append("FAQ");
		System.out.println(sbl);
		
		//Time for StringBuilder:
		
		long tTime=System.currentTimeMillis();
		for(int i=0;i<1000;i++)
		{
			sb.append("LABS");
		}
		
		System.out.println("Time Taken by SB: "+(System.currentTimeMillis()-tTime +"ms"));
		
		tTime=System.currentTimeMillis();
		for(int i=0;i<1000;i++)
		{
			sbl.append("Tutorial");
		}
		
		System.out.println("Time Taken by SBL: "+(System.currentTimeMillis()-tTime +"ms"));

	}

}
