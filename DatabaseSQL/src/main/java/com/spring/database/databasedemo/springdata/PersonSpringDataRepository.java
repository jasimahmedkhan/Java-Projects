package com.spring.database.databasedemo;

import com.spring.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository  extends JpaRepository<Person,Integer> {



}
