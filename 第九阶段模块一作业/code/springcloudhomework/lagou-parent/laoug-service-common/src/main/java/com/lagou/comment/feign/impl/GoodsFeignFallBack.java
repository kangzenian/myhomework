package com.lagou.comment.feign.impl;

import com.lagou.comment.feign.GoodsFeign;
import com.lagou.comment.pojo.Goods;
import org.springframework.stereotype.Component;

/**
 * 熔断触发后的回退逻辑，需要实现Feign接口
 */
@Component
public class GoodsFeignFallBack implements GoodsFeign {

    @Override
    public Goods findByOrderId(Integer orderId) {
        return null;
    }
}
