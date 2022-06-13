package com.example.springboot.web.springbootfirstwebapp.controller;

import com.example.springboot.web.springbootfirstwebapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.net.Authenticator;

@Controller
@SessionAttributes("name")
public class LoginController {

//    @Autowired
//    LoginService service;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcomePage(ModelMap model){
//        model.put("name", "jasim");
        model.put("name", getLoggedInUserName());
        return "welcome";
    }

    private String getLoggedInUserName(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if(principal instanceof UserDetails){
            return ((UserDetails) principal).getUsername();
        }
        return principal.toString();
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    @ResponseBody
    public String showLogin(ModelMap model){
//        model.put("name", name);
        return "login";
    }

    // enables the spring security configuration
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
////    @ResponseBody
//    public String typeLogin(@RequestParam String name, @RequestParam String password, ModelMap model){
//    // Model
//        if (service.validateUser(name, password)) {
//            model.put("name", name);
//            model.put("password", password);
//            return "welcome";
//        } else {
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        }
//    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam String name, ModelMap model){
        model.put("name", name);
        return "greeting";
    }

}
