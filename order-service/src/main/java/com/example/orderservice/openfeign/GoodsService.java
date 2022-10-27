package com.example.orderservice.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nanfang
 */

@FeignClient(value = "goods-service", path = "/goods")
public interface GoodsService {

    @GetMapping("/msg")
    String getGoodsMsg();
}
