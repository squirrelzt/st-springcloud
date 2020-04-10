package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


public class EurekeServerApplication {

    @SpringBootApplication
    @EnableEurekaServer
    public static class EurekeServerConfiguration {
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekeServerConfiguration.class, args);
    }
}
