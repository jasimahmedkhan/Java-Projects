package com.example.springboot.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {



    public static void main(String[] args) {
        // setting the application properties
//        System.setProperty("server.servlet.context-path", "/demo");
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
