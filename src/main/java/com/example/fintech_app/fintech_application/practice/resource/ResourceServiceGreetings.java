package com.example.fintech_app.fintech_application.practice.resource;

public class ResourceServiceGreetings {
    /**/
    private final long id;

    private final String content;

    public ResourceServiceGreetings(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }



}
