package com.demo.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restControler {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("asdf");
        return "hello from me";
    }
}
