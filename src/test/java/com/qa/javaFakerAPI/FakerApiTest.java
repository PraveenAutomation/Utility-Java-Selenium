package com.qa.javaFakerAPI;

import com.github.javafaker.Faker;

public class FakerApiTest {

	public static void main(String[] args) {
		Faker fake=new Faker();
		String city=fake.address().city();
		System.out.println(city);
		System.out.println(fake.country().countryCode2());

	}

}
