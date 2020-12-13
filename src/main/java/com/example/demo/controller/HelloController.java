package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/man")
    public String hello(@RequestParam("name")String name,@RequestParam("password")String password){
        System.out.println(name+password);
        //520
        return "我们去玩吧！";
    }
}
