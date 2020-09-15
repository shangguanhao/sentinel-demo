package com.shangguan.sentinel_demo.controller;

import com.shangguan.sentinel_demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String Hello(){
        return helloService.Hello();
    }

}
