package com.example.orderservice.controller;

import com.example.orderservice.openfeign.GoodsService;
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

    @Resource
    private GoodsService goodsService;

    @GetMapping("/msg")
    public String getOrderMsg(){
        String goodsMsg = restTemplate.getForObject("http://goods-service/goods/msg", String.class);
        String shopCartMsg = restTemplate.getForObject("http://shopcart-service/shopcart/msg", String.class);
        return "order info combined: " + goodsMsg + " " + shopCartMsg;
    }

    @GetMapping("/feignMsg")
    public String getFeignOrderMsg(){
        return goodsService.getGoodsMsg();
    }

}
