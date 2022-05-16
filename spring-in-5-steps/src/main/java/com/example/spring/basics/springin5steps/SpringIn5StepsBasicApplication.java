package com.example.spring.basics.springin5steps;

import com.example.spring.basics.springin5steps.basic.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {


    public static void main(String[] args) {

//        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        try(AnnotationConfigApplicationContext applicationContext =
                    new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {

//          ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

            // getting the beam from the application context container
            BinarySearchImpl binarySearch_1 = applicationContext.getBean(BinarySearchImpl.class);
            BinarySearchImpl binarySearch_2 = applicationContext.getBean(BinarySearchImpl.class);
            System.out.println("binarySearch_1 : " + binarySearch_1);
            System.out.println("binarySearch_2 : " + binarySearch_2);
            int result = binarySearch_1.binarySearch(new int[] {12, 4, 6, 7}, 4);
            System.out.println("the result = " + result);

        }


    }

}
