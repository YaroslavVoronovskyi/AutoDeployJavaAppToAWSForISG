package com.gmail.voronovskyi.yaroslav.isg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/jenkins")
    public String getHelloMessageFromJenkins() {
        return "Hello from Jenkins";
    }

    @GetMapping("/ec2")
    public String getHelloMessageFromEC2() {
        return "Hello from EC2";
    }
}
