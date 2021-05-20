package com.xyh.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
/*@PropertySource("classpath:/resources/application.properties")
@ConfigurationProperties(prefix = "user")*/
public class Holler {
    private String uname;
    private String age;
    private  String a;
    @RequestMapping("Holler")
    public  String holler(Model m){
        System.out.println("欢迎进入Hello uname"+this.uname+"age"+this.age);
        m.addAttribute("uname","张浩");
        return "holler";
    }
}
