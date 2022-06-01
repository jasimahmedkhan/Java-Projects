package com.example.springboot.web.springbootfirstwebapp.controller;

import com.example.springboot.web.springbootfirstwebapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    LoginService service;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    @ResponseBody
    public String showLogin(ModelMap model){
//        model.put("name", name);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody
    public String typeLogin(@RequestParam String name, @RequestParam String password, ModelMap model){
    // Model
        if (service.validateUser(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        } else {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam String name, ModelMap model){
        model.put("name", name);
        return "greeting";
    }

}
