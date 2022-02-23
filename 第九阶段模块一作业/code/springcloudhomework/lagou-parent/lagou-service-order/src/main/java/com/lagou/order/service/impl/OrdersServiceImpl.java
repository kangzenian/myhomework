package com.lagou.order.service.impl;

import com.lagou.comment.pojo.Orders;
import com.lagou.order.mapper.OrdersMapper;
import com.lagou.order.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author kangzenian
* @description 针对表【orders(订单表表)】的数据库操作Service实现
* @createDate 2022-02-17 13:26:39
*/
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * 根据订单id查询订单
     */
    @Override
    public Orders selectById(Integer id) {
        return ordersMapper.selectById(id);
    }

    /**
     * 分页查询所有订单
     * @param currentPage 当前页
     * @param pageSize 每页显示条数
     */
    @Override
    public Map<String, Object> selectAll(Integer currentPage, Integer pageSize) {
        
        // 设置数据偏移量
        Integer offset = (currentPage - 1) * pageSize;
        // 分页查询
        List<Orders> ordersList = ordersMapper.selectAllByPage(offset, pageSize);
        // 查询总条数
        Integer total = ordersMapper.selectCount();

        // 封装数据
        Map<String, Object> map = new HashMap<>();
        map.put("list", ordersList);
        map.put("total", total);

        return map;
    }
}
