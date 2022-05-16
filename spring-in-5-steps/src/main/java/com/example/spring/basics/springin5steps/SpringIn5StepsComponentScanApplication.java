package com.example.spring.basics.springin5steps;


import com.example.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.example.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    public static void main(String[] args) {

//        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
//        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

        // getting the beam from the application context container

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        ComponentDAO componentDAO1 = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
        LOGGER.info("{}", componentDAO.getComponentJdbcConnection());
        LOGGER.info("{}", componentDAO.getComponentJdbcConnection());

        LOGGER.info("{}", componentDAO1);
        LOGGER.info("{}", componentDAO1.getComponentJdbcConnection());


    }

}
