package com.xyh.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/h1")
    public String text(){
        return "Text my TextController";
    }
}
