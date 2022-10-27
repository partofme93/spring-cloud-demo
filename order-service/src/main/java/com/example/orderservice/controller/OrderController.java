package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhuifeng
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/msg")
    public String getOrderMsg(){
        String goodsMsg = restTemplate.getForObject("http://goods-service/goods/msg", String.class);
        String shopCartMsg = restTemplate.getForObject("http://shopcart-service/shopcart/msg", String.class);
        return "order info combined: " + goodsMsg + " " + shopCartMsg;
    }

}
