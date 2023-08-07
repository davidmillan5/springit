package com.springboot2.springit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/","/home"})
    public String home(){
        return "Hello, Spring Boot 2!";
    }
}
