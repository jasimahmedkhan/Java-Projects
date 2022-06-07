package com.example.coneva.csvjsonmapper.controller;


import com.example.coneva.csvjsonmapper.model.Schedule;
import com.example.coneva.csvjsonmapper.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@SessionAttributes("schedule")
public class MappingController {

    @Autowired
    JsonService jsonService;

    @GetMapping("/welcome")
    public String showWelcome(){
        return "welcome";
    }

    @GetMapping(value = "/json-schedule")
    public String returnScheduleAsJson(Model model) throws IOException {
        return jsonService.returnJson();
    }



}
