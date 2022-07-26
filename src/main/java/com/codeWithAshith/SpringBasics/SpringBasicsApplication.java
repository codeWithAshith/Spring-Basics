package com.codeWithAshith.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl();

		int result = binarySearch.binarySearch(new int[]{ 1,5,3,6,10}, 3);

		System.out.println(result);


//		SpringApplication.run(SpringBasicsApplication.class, args);
	}

}
