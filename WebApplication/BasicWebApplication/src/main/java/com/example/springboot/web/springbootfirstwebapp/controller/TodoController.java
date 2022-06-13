package com.example.springboot.web.springbootfirstwebapp.controller;

import com.example.springboot.web.springbootfirstwebapp.model.Todo;
import com.example.springboot.web.springbootfirstwebapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    TodoService service;

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        model.put("name", "jasim");
        return "welcome";
    }



    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodoList(ModelMap model){
        String name = (String) model.get("name");
        model.put("todos", service.retreiveTodos(name));
        return "list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model){
        model.addAttribute("todo", new Todo(0, (String) model.get("name"), "",
                new Date(), false));
        return "todo";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(ModelMap model, @RequestParam long id){
        service.deleteTodo(id);
        return "redirect:/list-todos";
    }

    @RequestMapping(value= "/update-todo", method= RequestMethod.GET)
    public String showUpdateTodo(ModelMap model, @RequestParam  long id){
        Todo todo = service.retreiveTodo(id);
        model.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value= "/update-todo", method= RequestMethod.POST)
    public String updateTodo(ModelMap model, Todo todo){
        service.deleteTodo(todo.getId());
        service.addTodo((String)model.get("name"), todo.getDesc(), todo.getTargetDate(), todo.getIsDone());

//        model.put("todo", todo);

        return "redirect:/list-todos";
    }


    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @Valid @ModelAttribute("todo") Todo todo, BindingResult result){
        if (result.hasErrors()) return "todo";
        service.addTodo((String)model.get("name"), todo.getDesc(), todo.getTargetDate(), todo.getIsDone());
//        model.put("todos", service.retreiveTodos((String) model.get("name")));
        // instead to redirect: /web-url
        return "redirect:/list-todos";
    }
}
