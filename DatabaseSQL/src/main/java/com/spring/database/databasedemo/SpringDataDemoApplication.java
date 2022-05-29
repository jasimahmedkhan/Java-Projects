package com.spring.database.databasedemo;

import com.spring.database.databasedemo.entity.Person;
import com.spring.database.databasedemo.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonSpringDataRepository personJPADao;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", personJPADao.findById(10001));
//        personJPADao.findPersonByBirth_date(new Date(1994, 26,12));
        logger.info("Inserting 10006 -> {}", personJPADao.save(new Person("Tara", "Berlin", new Date())));
        logger.info("Updating 10003 by ID -> {}", personJPADao.save(new Person( "Qasim", "PC", new Date())));
        logger.info("All users -> {}", personJPADao.findAll());
//        personJPADao.deleteById(10005);


//        logger.info("Users id 10001 -> {}", dao.findById(10001));
//        logger.info("User Name -> {}", dao.findByName("Jasim Ahmed"));
//        logger.info("User by Name and ID -> {}", dao.findByNameAndId("Jasim Ahmed", 10001));


    }
}
