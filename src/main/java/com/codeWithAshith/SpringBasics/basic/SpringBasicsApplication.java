package com.codeWithAshith.SpringBasics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBasicsApplication.class, args);

        // Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);

        int result = binarySearch.binarySearch(new int[]{1, 5, 3, 6, 10}, 3);

        System.out.println(result);
    }

}
