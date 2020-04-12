package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenFeignApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OpenFeignApplication.class).run(args);
    }
}
