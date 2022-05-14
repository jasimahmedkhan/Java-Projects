package com.example.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {


    public static void main(String[] args) {

//        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

        // getting the beam from the application context container
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[] {12, 4, 6, 7}, 4);
        System.out.println("the result = " + result);


    }

}
