package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@EnableDiscoveryClient // 激活服务发现客户端
@RestController
public class EurekeClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekeClientApplication.class, args);
    }
}
