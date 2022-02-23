package com.lagou.goods.mapper;
import com.lagou.comment.pojo.GoodsVO;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lagou.comment.pojo.Goods;

import java.util.List;


/**
* @author kangzenian
* @description 针对表【goods(商品表)】的数据库操作Mapper
* @createDate 2022-02-17 13:33:15
* @Entity .com.lagou.comment.pojo.Goods
*/
public interface GoodsMapper extends BaseMapper<Goods> {

    // 根据id查询商品
    public Goods selectByIdGoods(@Param("id") Integer id);

    // 通过id删除商品
    public int deleteById(@Param("id") Integer id);

    // 通过id编辑商品
    public int updateSelective(Goods goods);

    // 多条件分页查询商品
    public List<Goods> findAllByPage(GoodsVO goodsVO);

    // 根据订单id查询商品列表
    public Goods selectByOrderId(@Param("orderId") Integer orderId);
}
