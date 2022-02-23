package com.lagou.comment.feign;

import com.lagou.comment.feign.impl.GoodsFeignFallBack;
import com.lagou.comment.pojo.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "lagou-service-goods",fallback = GoodsFeignFallBack.class)
public interface GoodsFeign {

    @GetMapping("/goods/findByOrderId/{orderId}")
    public Goods findByOrderId(@PathVariable Integer orderId);
}
