package com.qa.arrayMinMax;

public class LargestElementInArrayByForloop {

	public static void main(String[] args) {
		
		int[] a= {7,8,9,2,4,10,25,36,96,41};
		
		System.out.println("Largest Element: "+getLargestNum(a));
		System.out.println("Maximum Element : "+getMax(a));
		System.out.println("Minimum Number "+getMinmumNum(a));

	}

	private static int getMax(int[] a) {
		
		int maxVal=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>maxVal)
			{
				maxVal=a[i];
			}
		}
		return maxVal;
		
	}

	private static int getLargestNum(int[] a) {
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-1];
		
	}
	
private static int getMinmumNum(int[] a) {
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-1];
		
	}

}
