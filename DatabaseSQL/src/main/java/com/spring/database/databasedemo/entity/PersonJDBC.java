package com.spring.database.databasedemo.entity;

import java.util.Date;

// rename it to Person for using it with the Spring JDBC API
public class PersonJDBC {

    private int id;
    private String name;
    private String location;
    private Date birth_date;

    // No argument constructor is required for the case if there is no constructor present
    // Java's fail-safe way.
    public PersonJDBC() {

    }

    public PersonJDBC(int id, String name, String location, Date birth_date) {
        this.id = id;
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
