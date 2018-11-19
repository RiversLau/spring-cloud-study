package com.zhaoxiang.eurekaFeignClient.controller;

import com.zhaoxiang.eurekaFeignClient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Rivers
 * @date: 2018/11/17
 */
@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(required = false, defaultValue = "zhaoxiang") String name) {
        return hiService.sayHi(name);
    }
}
