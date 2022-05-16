package com.example.spring.basics.springin5steps;

import com.example.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan
// app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {


    public static void main(String[] args) {

//        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        try(AnnotationConfigApplicationContext applicationContext =
                    new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {

//          ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

            // getting the beam from the application context container
            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
            System.out.println(someExternalService.returnServiceURL());

            SomeExternalService someExternalService1 = applicationContext.getBean(SomeExternalService.class);
            System.out.println(someExternalService1.returnServiceSpringUrl());

        }


    }

}
