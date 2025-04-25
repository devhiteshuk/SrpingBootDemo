package com.dhl.spring.SrpingBootDemo.controller;

import com.dhl.spring.SrpingBootDemo.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        System.out.println("Application name : "+appName);
        return getViewName();
    }

    private String getViewName(){
        return "index.html";
    }

    //localhost:8080/home/getHomeAddress

    @GetMapping("/getHomeAddress")
    public String getHomeAddress(){
        return homeService.getHomeAddress();
    }

}
