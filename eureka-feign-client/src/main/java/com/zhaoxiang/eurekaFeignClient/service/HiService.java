package com.zhaoxiang.eurekaFeignClient.service;

import com.zhaoxiang.eurekaFeignClient.EurekaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Rivers
 * @date: 2018/11/17
 */
@Service
public class HiService {

    @Autowired
    private EurekaFeignClient eurekaFeignClient;

    public String sayHi(String name) {
        return eurekaFeignClient.sayHiFromEurekaClient(name);
    }
}
