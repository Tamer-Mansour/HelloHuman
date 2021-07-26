package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControlar {

    @RequestMapping("/")
    public String hello() {
        return "Hello World !!!!!!!!!!";
    }
    @RequestMapping("/world")
    public String world(){
        return "Class level annotation are cool too! ";
    }
}
