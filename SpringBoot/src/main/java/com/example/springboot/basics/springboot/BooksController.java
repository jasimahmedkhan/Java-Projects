package com.example.springboot.basics.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BooksController {
    // Call the URI with resource /books

    private AtomicLong counter = new AtomicLong();


    @GetMapping("/greetings")
    @ResponseBody
    public Greetings getGreetings(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name){
        return new Greetings(counter.incrementAndGet(), "Hello Welcome !! " +  name);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return List.of(new Book(1l, "Mastering Spring 5", "Ranga Karana"),
                new Book(13l, "Deep Learning with Python", "Francois Cheverlot" ));
    }




}
