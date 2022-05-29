package com.spring.database.databasedemo.jpa;


import com.spring.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

// this class is a Repository
// we do Transactions management here e.g. add, delete and insert
@Repository
@Transactional
public class PersonJPADao {

    // connect to the database, everything is stored in the PersistenceContext and EntityManager is the interface
    // for accessing the entities
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id){
        // get by JPA
        return entityManager.find(Person.class, id);
    }

    // update or insert, we need to call the merge method. so if there is no id
    // set then it would set the id and etc
    public Person update(Person person){
        return entityManager.merge(person);
    }

    public Person insert(Person person){
        return entityManager.merge(person);
    }

    public void delete(int id){
        Person person = findById(id);
        entityManager.remove(person);
    }

    // We use the JPQL to create a named query by assigning it a name and the entity we want to return
    // then we call the getresultList to retrieve all the results from the TypedQuery
    public List<Person> findAll(){
        TypedQuery<Person> namedQuery =  entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }

//    public Person delete

}
