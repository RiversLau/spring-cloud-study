package com.zhaoxiang.eurekaFeignClient;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author: Rivers
 * @date: 2018/11/17
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer getFeignRetryer() {
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
