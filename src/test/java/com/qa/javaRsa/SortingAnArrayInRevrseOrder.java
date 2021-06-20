package com.qa.javaRsa;

import java.util.Arrays;
import java.util.Collections;

public class SortingAnArrayInRevrseOrder {

	public static void main(String[] args) {
		Integer a[]= {10,2,4,5,8,9,6,3,5,7,4,1,2,12,13,55,41,69};
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		

	}

}
