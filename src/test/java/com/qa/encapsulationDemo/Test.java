package com.qa.encapsulationDemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Function<List<Integer>, Integer> function= x-> x
				.stream().map(i->i*2).mapToInt(i->i)
				.distinct().sum();
		
		Function<Integer, Integer> function2=x->x*10;
		Function<Integer, Integer> function3=x->x*100;
		
		int len=function.andThen(function2).andThen(function3).apply(Arrays.asList(1,2,2));
		System.out.println(len);
		
		int [] scores = {1,3,8,3,5,6,2,4};
		
		List<Integer> bestScore1=Arrays.stream(scores).boxed().sorted().skip(5).collect(Collectors.toList());
		System.out.println(bestScore1);
		
		List<Integer> bestScore2=Arrays.stream(scores).boxed().sorted().skip(4).collect(Collectors.toList());
		System.out.println(bestScore2);
		
		//List<Integer> bestScore3=Arrays.stream(scores).sorted().skip(5).collect(Collectors.toList());
		//System.out.println(bestScore2);
		
		Collection<Integer> c= Arrays.asList(1,2,3,4,5);
		List<Integer> list=c.stream().filter(i->i%2==0).map(i->i=i*2-1)
				.filter(i->i>4).collect(Collectors.toList());
		System.out.println(list);
		
		Collection<Integer> c1= Arrays.asList(1,2,3,4,5);
		//List<Integer> list1=c.stream().filter(i->i%2==0).filter(i->i=i*2-1)
				//.map(i->i>4).collect(Collectors.toList());
		//System.out.println(list);
		
		

	}

}
