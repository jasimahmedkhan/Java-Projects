package com.example.coneva.csvjsonmapper.controller;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

    @GetMapping("/welcome")
    public String returnJson(){
        return "your are seeing the welcome page";
    }
//
//    @GetMapping("/csv-schedule")
//    public void receiveSchedule(ModelMap model, @RequestParam String name){
//
//    }
}
