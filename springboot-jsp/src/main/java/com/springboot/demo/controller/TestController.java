package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
