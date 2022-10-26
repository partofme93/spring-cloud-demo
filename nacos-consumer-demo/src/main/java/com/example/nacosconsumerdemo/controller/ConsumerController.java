package com.example.nacosconsumerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhuifeng
 */

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/msg")
    public String consumerMsg(){
        return "nacos-consumer-demo";
    }

    @GetMapping("/test")
    public String test(){
        return restTemplate.getForObject("http://naco-provider-service/products/list", String.class);
    }
}
