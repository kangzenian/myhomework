package com.lagou.order.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lagou.comment.pojo.Orders;

/**
* @author kangzenian
* @description 针对表【orders(订单表表)】的数据库操作Mapper
* @createDate 2022-02-17 13:26:39
* @Entity com.lagou.comment.pojo.Orders
*/
public interface OrdersMapper extends BaseMapper<Orders> {

    // 根据订单id查询订单
    public Orders selectById(@Param("id") Integer id);

    /**
     * 分页查询所有订单
     * @param offset 数据偏移
     * @param pageSize 每页显示条数
     */
    public List<Orders> selectAllByPage(@Param("offset")Integer offset, @Param("pageSize")Integer pageSize);

    // 查询订单总条数
    public Integer selectCount();
}
