package com.restsapi.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question1Controller {

    @GetMapping("/springboot")
    public String helloWorld(){
        return "Welcome to spring boot";
    }
}
