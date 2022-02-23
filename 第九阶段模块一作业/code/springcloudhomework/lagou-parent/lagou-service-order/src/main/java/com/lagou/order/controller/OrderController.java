package com.lagou.order.controller;

import com.lagou.comment.feign.GoodsFeign;
import com.lagou.comment.pojo.Goods;
import com.lagou.comment.pojo.Orders;
import com.lagou.order.service.OrdersService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private GoodsFeign goodsFeign;

    /**
     * 根据订单id查询订单
     */
    @GetMapping("/findById/{id}")
    public Orders findById(@PathVariable Integer id) {
        return ordersService.selectById(id);
    }

    /**
     * 分页查询所有订单
     */
    @GetMapping("/findAllPage/{currentPage}/{pageSize}")
    public Map<String, Object> findAllPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        return ordersService.selectAll(currentPage, pageSize);
    }

    /**
     * 根据订单id查询商品列表
     */
    @HystrixCommand(threadPoolKey = "findGoodsById")    //每个方法维护一个线程池
    @GetMapping("/findGoodsById/{id}")
    public Goods findGoodsById(@PathVariable Integer id) {
        return goodsFeign.findByOrderId(id);
    }
}
