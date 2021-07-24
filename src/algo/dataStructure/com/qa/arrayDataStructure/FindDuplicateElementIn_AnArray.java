package com.qa.arrayDataStructure;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementIn_AnArray {

	public static void main(String[] args) {
		int[] a= {1,4,8,9,8,5,2,1,4,5,5};
		System.out.println(findDuplicates(a));

	}
	
	//Find All Duplicates in an Array
	public static List<Integer> findDuplicates(int[] nums) {
	        
	        //Declared list of integers for output
	        List<Integer> result = new ArrayList<>();
	        
	        //Traverse an array
	        for (int val : nums) {
	            //Visit at that index
	            int index = Math.abs(val) - 1;
	            
	            /*
	             If number present at index is -ve,
	             It means it is already appeared in an array.
	            */
	            if (nums[index] < 0) 
	                result.add(index + 1);
	             
	            else 
	                nums[index] = -nums[index];
	            
	        }
	        
	        return result;
	    }

}
