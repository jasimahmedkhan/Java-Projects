package com.example.spring.basics.springin5steps;


import com.example.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.spring.basics.springin5steps.cdi")
public class SpringIn5StepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

    public static void main(String[] args) {

//        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);

        // getting the beam from the application context container

        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

        LOGGER.info("{} DAO - {}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());

    }

}
