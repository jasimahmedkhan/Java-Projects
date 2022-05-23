package com.spring.database.databasedemo;

import com.spring.database.databasedemo.entity.Person;
import com.spring.database.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseSqlApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao dao;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseSqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", dao.findAll());
        logger.info("Users id 10001 -> {}", dao.findById(10001));
        logger.info("User Name -> {}", dao.findByName("Jasim Ahmed"));
        logger.info("User by Name and ID -> {}", dao.findByNameAndId("Jasim Ahmed", 10001));
        logger.info("Deleting 10002 by ID -> {}", dao.deleteById(10002));
        logger.info("Inserting 10006 -> {}", dao.insert(new Person(10006, "Tara", "Berlin", new Date())));
        logger.info("Updating 10003 by ID -> {}", dao.update(new Person(10003, "Qasim", "PC", new Date())));


    }
}
