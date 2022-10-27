package com.example.goodsservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wunanfang
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/msg")
    public String getGoodsMsg(){
        return "Goods Msg From Port: " + port;
    }
}
