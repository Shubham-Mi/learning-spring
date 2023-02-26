package com.example.firstproj.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController2 {
//    This function will work as they are running on different routes
    @GetMapping("/abc")
    public String abc() {
        return "Hello World!";
    }

//    Two functions running on same root do not work
//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello World!";
//    }
}
