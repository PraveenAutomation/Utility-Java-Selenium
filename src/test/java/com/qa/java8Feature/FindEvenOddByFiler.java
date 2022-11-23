package com.qa.java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOddByFiler {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,4,6,7,8,9,11,10);
		
		List<Integer> odd=list.stream().filter(n->n%2!=0).collect(Collectors.toList());
		List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(odd);
		System.out.println(even);
	

	}

}
