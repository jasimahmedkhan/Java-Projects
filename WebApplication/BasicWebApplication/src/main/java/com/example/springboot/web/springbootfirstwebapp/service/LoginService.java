package com.example.springboot.web.springbootfirstwebapp.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String username, String password){
        // password == value and username ==  value ---> true
        return username.equalsIgnoreCase("jasim")
                && password.equalsIgnoreCase("hello");
    }

}
