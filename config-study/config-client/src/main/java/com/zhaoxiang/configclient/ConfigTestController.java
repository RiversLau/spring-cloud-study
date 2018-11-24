package com.zhaoxiang.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Rivers
 * @date: 2018/11/21
 */
@RefreshScope
@RestController
public class ConfigTestController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public String sayHi() {
        return foo;
    }
}
