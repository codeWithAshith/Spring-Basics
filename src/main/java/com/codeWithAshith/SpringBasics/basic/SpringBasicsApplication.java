package com.codeWithAshith.SpringBasics.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsApplication {

    public static void main(String[] args) {

        // Application Context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);

        int result = binarySearch.binarySearch(new int[]{1, 5, 3, 6, 10}, 3);

        System.out.println(result);
    }

}
