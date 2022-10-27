package com.example.shopcartservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuifeng
 */

@RestController
@RequestMapping("/shopcart")
public class ShopController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/msg")
    public String getShopCartMsg(){
        return "ShopCart Msg From Port: " + port;
    }
}
