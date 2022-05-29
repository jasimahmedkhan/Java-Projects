package com.spring.database.databasedemo.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
// for call and retrieving the named query
@NamedQuery(name="find_all_persons", query = "select p from Person p")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String name;
    private String location;
    private Date birth_date;

    // No argument constructor is required for the case if there is no constructor present
    // Java's fail-safe way.
    public Person() {

    }

    public Person(int id, String name, String location, Date birth_date) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birth_date = birth_date;
    }

    public Person(String name, String location, Date birth_date) {
        this.name = name;
        this.location = location;
        this.birth_date = birth_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "\n" + "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birth_date=" + birth_date +
                '}';
    }
}
