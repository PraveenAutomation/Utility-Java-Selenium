package com.qa.streamRsaSection14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.netty.handler.codec.http.HttpHeaders.Names;

public class StremDemo {
	
	@Test
	public void normalArrayList()
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("VDA");
		names.add("Vanu");
		names.add("Raja");
		names.add("Vantu");
		names.add("Pryam");
		names.add("Hind");
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("V"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void streamDemo1()
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("VDA");
		names.add("Vanu");
		names.add("Raja");
		names.add("Vantu");
		names.add("Pryam");
		names.add("Priya");
		names.add("Hind");
		
		long c=names.stream().filter(s->s.startsWith("P")).count();
		System.out.println(c);
		
		// Print all the name that has length more than 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println("Name are more than 4 "+s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println("Only 1 "+s));
	}
	
	@Test
	public void streamDemo2()

	{
		long d=Stream.of("Atin","All","Neen","Nitin","Awaz","Fizz","Array").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
	}
	
	@Test
	public void streamMap()
	{
		// Print name which has letter 'a' with caps letter:
		Stream.of("Atin","All","Neena","Nitin","Awaz","Fizz","Array").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		System.out.println("===================================");
		
		List<String> name1=Arrays.asList("Atin","Ananys","Nanu","Awaz","Marray","Fizz");
		name1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		// Merging 2 different list:
		ArrayList<String> names = new ArrayList<String>();
		
			names.add("VDA");
			names.add("Vanu");
			names.add("Raja");
			names.add("Vantu");
			Stream<String> newStream=Stream.concat(names.stream(), name1.stream());
			System.out.println("===================================");
			//newStream.sorted().forEach(s->System.out.println(s));
			System.out.println("===================================");
			
			boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Raja"));
			System.out.println(flag);
			Assert.assertTrue(flag);	
	}
	
	@Test
	public void streamCollect()
	{
		List<String> ls=Stream.of("Atina","All","Neena","Nitin","Awaz","Fizz","Array").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values=Arrays.asList(4,5,7,8,5,4,7,9,6);
		//values.stream().sorted().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(li.get(0));
		
		
	}

}
