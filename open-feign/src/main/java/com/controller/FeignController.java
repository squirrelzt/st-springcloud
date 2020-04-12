package com.controller;

import com.client.MyFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

@RestController
@RequestMapping("feign")
public class FeignController {

    @Resource
    MyFeignClient myFeignClient;

    @GetMapping("services")
    public Set<String> getServices() {
        return myFeignClient.getServices();
    }
}
