package com.sxt.web1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class TestController {
@GetMapping(value = "/home")
    public  String test(){
    System.out.println("执行了Controller..");
        return "main";
    }
}
