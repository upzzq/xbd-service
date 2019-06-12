package com.xbd.svc.pro.bbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan(basePackages = "com.xbd.svc")
@EnableFeignClients("com.xbd.svc")
//@EnableHystrixDashboard
public class ServiceProBbdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProBbdApplication.class, args);
    }

}

