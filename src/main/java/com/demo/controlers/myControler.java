package com.demo.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class myControler {
    @RequestMapping({"","/","/home"})
    public String returnHome(){
        return "home";
    }
    @RequestMapping("/asd")
    public String asd(){
        return "home";
    }
}
