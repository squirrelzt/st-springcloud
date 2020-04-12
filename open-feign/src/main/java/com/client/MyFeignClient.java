package com.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;

@FeignClient(name = "myFeign", url = "http://localhost:8091")
public interface MyFeignClient {

    @GetMapping("services")
    public Set<String> getServices();
}
