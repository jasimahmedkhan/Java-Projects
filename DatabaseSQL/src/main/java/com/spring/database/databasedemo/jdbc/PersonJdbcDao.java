package com.spring.database.databasedemo.jdbc;


import com.spring.database.databasedemo.entity.PersonJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    // for creating your own custom row mapper, if the data input is out of order
    class PersonRowMapper implements RowMapper<PersonJDBC>{

        @Override
        public PersonJDBC mapRow(ResultSet rs, int rowNum) throws SQLException {
            PersonJDBC person = new PersonJDBC();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirth_date(rs.getDate("birth_date"));
            return person;
        }
    }

    // for using the custom row mapper
    public List<PersonJDBC> findAll(){
        return jdbcTemplate.query("select * from person", new PersonRowMapper());
    }

//    public List<Person> findAll(){
//        return jdbcTemplate.query("select * from person",
//                new BeanPropertyRowMapper<Person>(Person.class));
//    }



    public PersonJDBC findById(int id){
        return jdbcTemplate.queryForObject("select * from person where ID=?",
                new Object[]{id},
                new BeanPropertyRowMapper<PersonJDBC>(PersonJDBC.class));
    }


    public PersonJDBC findByName(String name){
        return jdbcTemplate.queryForObject("select * from person where NAME=?",
                new Object[]{name},
                new BeanPropertyRowMapper<>(PersonJDBC.class));
    }

    public PersonJDBC findByNameAndId(String name, int id){
        return jdbcTemplate.queryForObject("select * from person where NAME=? and ID=?",
                new Object[]{name, id},
                new BeanPropertyRowMapper<>(PersonJDBC.class));
    }

    public int deleteById(int id){
        return jdbcTemplate.update("delete from person where ID=?",
                new Object[]{ id });
    }

    // Insert
    public int  insert(PersonJDBC person){
        return jdbcTemplate.update(
                "insert into person (id, name, location, birth_date)" +
                        "values (?,?,?,?)",
                new Object[] {person.getId(), person.getName(),
                        person.getLocation(), person.getBirth_date()});
    }

    // Update
    public int update(PersonJDBC person){
        return jdbcTemplate.update(
                "update person " + " set name = ?, location = ?, birth_date = ?" + "where id = ?",
                new Object[] { person.getName(),
                        person.getLocation(), person.getBirth_date(), person.getId()});
    }





}
