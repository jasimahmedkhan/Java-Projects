package com.basic.mockito.mockitodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.zip.DataFormatException;

@SpringBootApplication
public class MockitoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockitoDemoApplication.class, args);

        SomeBusinessShoeImpl someBusinessShoe = new SomeBusinessShoeImpl(new Nike());
        int result = someBusinessShoe.retrieveShoeNumber();
        System.out.println("result " + result);

    }

}
