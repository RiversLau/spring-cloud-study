package com.zhaoxiang.eurekaturbinemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class EurekaTurbineMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTurbineMonitorApplication.class, args);
    }
}
