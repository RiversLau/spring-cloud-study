package com.zhaoxiang.eurekaRibbonClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Rivers
 * @date: 2018/11/17
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }
}
