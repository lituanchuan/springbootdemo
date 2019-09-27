package com.qf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value="/hello")
    public String hell(){

        return  "hellogggg";
    }

}
