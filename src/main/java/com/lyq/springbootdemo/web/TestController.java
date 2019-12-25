package com.lyq.springbootdemo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
/*

    @Value("${app.msg}")
    private String msg;
*/

/*    @RequestMapping("/testJson")
    public String test(){
        return "Hello,SpringBoot!";
    }*/

/*
    @GetMapping("/")
    public String (){
        return msg;
    }*/

    @GetMapping
    public String test(){
        if(true){
            throw new RuntimeException("异常测试");
        }
        return "index";
    }
}
