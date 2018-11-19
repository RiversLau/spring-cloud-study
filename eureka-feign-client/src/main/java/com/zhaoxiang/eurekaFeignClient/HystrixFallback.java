package com.zhaoxiang.eurekaFeignClient;

import org.springframework.stereotype.Component;

/**
 * @author: Rivers
 * @date: 2018/11/19
 */
@Component
public class HystrixFallback implements EurekaFeignClient {

    @Override
    public String sayHiFromEurekaClient(String name) {
        return "Error occured!";
    }
}
