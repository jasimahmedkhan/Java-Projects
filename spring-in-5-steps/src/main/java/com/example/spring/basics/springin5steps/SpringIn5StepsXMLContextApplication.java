package com.example.spring.basics.springin5steps;

import com.example.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.example.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {


    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

    public static void main(String[] args) {

        // for manually wiring the application context with beans that are manually defined and autowired
        // instantiated in the applicationContext.xml,  we need to create a ClassPathXmlApplicationContext object
        // and pass the location of the configLocation.
        try(ClassPathXmlApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml")) {


            LOGGER.info("Beans Loaded --> {}", (Object) applicationContext.getBeanDefinitionNames());


            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
            System.out.println(xmlPersonDAO);
            System.out.println("The number of Employees = " + xmlPersonDAO.getNumberOfEmployees());
            System.out.println(xmlPersonDAO.getXmlJdbcConnection());
            xmlPersonDAO.setNumberOfEmployees(10);
            System.out.println("The number of Employees = " + xmlPersonDAO.getNumberOfEmployees());
            System.out.println(xmlPersonDAO.getXmlBuisnessConnection());


        }


    }

}
