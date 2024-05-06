package com.example.h2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/test")
    public String testing(){
        System.out.println("testing employee controller");
        return "success";
    }

}
