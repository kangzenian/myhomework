package com.lagou.order.service;


import com.lagou.comment.pojo.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author kangzenian
* @description 针对表【orders(订单表表)】的数据库操作Service
* @createDate 2022-02-17 13:26:39
*/
public interface OrdersService {

    // 根据订单id查询订单
    public Orders selectById(Integer id);

    /**
     * 分页查询所有订单
     * @param currentPage 当前页
     * @param pageSize 每页显示条数
     */
    public Map<String, Object> selectAll(Integer currentPage, Integer pageSize);
}
