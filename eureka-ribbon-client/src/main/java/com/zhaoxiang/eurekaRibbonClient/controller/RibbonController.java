package com.zhaoxiang.eurekaRibbonClient.controller;

import com.zhaoxiang.eurekaRibbonClient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Rivers
 * @date: 2018/11/17
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(required = false, defaultValue = "zhaoxiang") String name) {
        return ribbonService.sayHi(name);
    }

    @GetMapping("/testRibbon")
    public String testChoose() {
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        return instance.getHost() + ":" + instance.getPort();
    }
}
