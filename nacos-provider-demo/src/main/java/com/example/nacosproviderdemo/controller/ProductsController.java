package com.example.nacosproviderdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuifeng
 */

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/list")
    public String getProductList(){
        return "this is products from server port: " + serverPort;
    }
}
