package com.example.springboot.springbootdemo;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    @ResponseBody
    public  Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/")
    public String login(@RequestParam(value = "name", defaultValue = "World") String name){
        return "Hello from the other side !!!";
    }

    @PostMapping("/welcome")
    public Greeting welcome(@RequestParam(value = "name", defaultValue = "Welcome to the world") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
