package com.spring.database.databasedemo.jdbc;


import com.spring.database.databasedemo.entity.PersonJPA;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJPADao implements CrudRepository<PersonJPA, Integer> {

    public List<PersonJPA>
}
