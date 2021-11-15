package com.wbb.hello.controller;

import com.wbb.hello.pojo.Hello;
import com.wbb.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;


    @GetMapping("/hellojson")
    public List<Hello> findAll(){
        return userService.findAll();
    }

    @GetMapping("getByAge")
    public List<Hello> findByAge(@RequestParam("age") String age){
        return userService.findByAge(age);
    }

}
