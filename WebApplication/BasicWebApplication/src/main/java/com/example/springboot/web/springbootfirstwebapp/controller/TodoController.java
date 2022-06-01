package com.example.springboot.web.springbootfirstwebapp.controller;

import com.example.springboot.web.springbootfirstwebapp.service.LoginService;
import com.example.springboot.web.springbootfirstwebapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    TodoService service;


    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
//    @ResponseBody
    public String showTodoList(ModelMap model){
        String name = (String) model.get("name");
        model.put("todos", service.retreiveTodos(name));
        return "list-todos";
    }

}
