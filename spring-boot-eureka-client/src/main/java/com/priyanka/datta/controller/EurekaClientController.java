package com.priyanka.datta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @GetMapping("/hello-eureka")
    public String method(){
        return "Hello eureka client";
    }
}
