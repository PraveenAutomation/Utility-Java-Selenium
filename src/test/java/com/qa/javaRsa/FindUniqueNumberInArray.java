package com.qa.javaRsa;

import java.util.ArrayList;

public class FindUniqueNumberInArray {
	
	public static void main(String[] args) {
		
		int[] a= {4,4,5,7,8,4,5,8,9,6,6,3,2,5,5,6,3,2,5};
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.print(a[i]+" : "+k);
				//System.out.println(k);
				if(k==1)
					System.out.println("Unique Number is: "+a[i]);
			}
		}
		
	}

	

}
