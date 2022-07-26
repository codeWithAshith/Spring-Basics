package com.codeWithAshith.SpringBasics.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

    // What are the beans?
    // What are the dependencies of a bean/
    // Where to search for beans?

    public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());


        SpringApplication.run(SpringBasicsApplication.class, args);

        // Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

        // Singleton Bean - one instance per spring context
        System.out.println(binarySearch);
        System.out.println(binarySearch1);

        int result = binarySearch.binarySearch(new int[]{1, 5, 3, 6, 10}, 3);

        System.out.println(result);
    }

}
