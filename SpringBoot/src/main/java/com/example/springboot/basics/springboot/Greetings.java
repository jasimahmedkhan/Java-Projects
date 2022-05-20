package com.example.springboot.basics.springboot;

public class Greetings {

    private long id;
    private String content;

    public Greetings(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent(){
        return content;
    }

    @Override
    public String toString() {
        return "Greetings{" + "id=" + id + ", content='" + content + '\'' + '}';
    }
}
