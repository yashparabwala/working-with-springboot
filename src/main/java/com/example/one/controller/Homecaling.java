package com.example.one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecaling {

    @RequestMapping("/")
    public String call(){
        return "Hello Spring...";
    }
}
