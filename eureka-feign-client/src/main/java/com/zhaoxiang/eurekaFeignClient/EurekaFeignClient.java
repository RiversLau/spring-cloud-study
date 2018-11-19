package com.zhaoxiang.eurekaFeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Rivers
 * @date: 2018/11/17
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaFeignClient {

    @GetMapping(value = "/hi")
    String sayHiFromEurekaClient(@RequestParam(value = "name") String name);
}
