package com.example.springboot.web.springbootfirstwebapp.service;

import com.example.springboot.web.springbootfirstwebapp.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private int todoCount = 3;

    static {
        todos.add( new Todo(1, "jasim", "learn spring", new Date(), true));
        todos.add(new Todo(2, "jasim", "learn spring boot", new Date(), false));
        todos.add(new Todo(3, "jasim", "learn bash", new Date(), true));
        todos.add(new Todo(4, "ahmed", "learn java", new Date(), true));
        todos.add(new Todo(5, "ahmed", "learn python", new Date(), false));
        todos.add(new Todo(6, "ahmed", "learn C", new Date(), false));
    }

    public List<Todo> retreiveTodos(String user){
        List<Todo> filteredTodos = new ArrayList<>();
        for (Todo todo: todos) {
//            filteredTodos.add(todo) = todo.getUser().equals(user) ? todo: continue;
            if (todo.getUser().equals(user)){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public Todo retreiveTodo(long id){
        for (Todo todo: todos) {
//            filteredTodos.add(todo) = todo.getUser().equals(user) ? todo: continue;
            if (todo.getId() == id){
                return todo;
            }
        }
        return null;
    }

    public void addTodo(String name, String desc, Date date, boolean isDone){
        todos.add(new Todo(++todoCount, name, desc, date, isDone));
    }

//    public void updateTodo(long id){
//        Iterator<Todo> iterator = todos.iterator();
//        while(iterator.hasNext()){
//            Todo todo = iterator.next();
//            if (todo.getId() == id){
//                iterator.remove();
//                this.addTodo(todo.getUser(), todo.getDesc(), todo.getTargetDate(), todo.isDone());
//            }
//
//        }
//    }

    public void deleteTodo(long id){
        Iterator<Todo> iterator = todos.iterator();
        while(iterator.hasNext()){
            Todo todo = iterator.next();
            if (todo.getId() == id){
                iterator.remove();
            }
        }
    }
}
