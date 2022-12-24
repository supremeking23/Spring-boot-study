package com.example.fintech_app.fintech_application.practice;

import com.example.fintech_app.fintech_application.practice.resource.ResourceServiceGreetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Practice {
    @GetMapping("/world")
    public String hello(@RequestParam(value ="name", defaultValue = "mavis") String name){
    return String.format("Hello %s", name);
    }

    private static final String template = "Hi po, %s !";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public ResourceServiceGreetings greeting(@RequestParam(value = "name", defaultValue = "Emma") String name){
        return new ResourceServiceGreetings(counter.incrementAndGet(),String.format(template, name));
    }

    @GetMapping("war")
    public String war(){
        return "War";
    }
}
