package com.synnex.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public  String hello(){
        System.out.print("Hello Spring Boot!!!!!!!");
        return  "I am Idea!!!!";
    }
}
