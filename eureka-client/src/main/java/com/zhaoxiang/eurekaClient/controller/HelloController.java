package com.zhaoxiang.eurekaClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Rivers
 * @date: 2018/11/17
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return "Hi, " + name + ", I am from port: " + port;
    }
}
