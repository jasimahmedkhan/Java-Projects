package com.example.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EntityScan("com.example.database")
public class DatabaseApplication{

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(EmployeeRepository repository){
        return (args -> {
            insertJavaAdvocate(repository);
//            System.out.println(repository.findAll());
            returnAllUsers(repository);
            System.out.println(repository.findEmployeesByLastNameContaining(" "));

        });

    }

    private void insertJavaAdvocate(EmployeeRepository repository){
        repository.save(new Employee("Dalia", "Abo Sheesha"));
        repository.save(new Employee("Jasim", "Ahmed"));
        repository.save(new Employee("Abdullah", "Amjad Daski"));
        repository.save(new Employee("Irfan", "Khan"));
        repository.save(new Employee("Asim", "Khan"));
    }

    public void returnAllUsers(EmployeeRepository repository){
        logger.info("All users -> {}", repository.findAll());
    }

}
