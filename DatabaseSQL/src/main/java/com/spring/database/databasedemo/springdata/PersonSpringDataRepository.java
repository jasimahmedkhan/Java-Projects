package com.spring.database.databasedemo.springdata;

import com.spring.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;


// you can use either
// public interface PersonSpringDataRepository  extends CrudRepository<Person,Integer> {
// OR this
public interface PersonSpringDataRepository  extends JpaRepository<Person,Integer> {

//    List<Person> findPersonByBirth_date(Date date);


}
