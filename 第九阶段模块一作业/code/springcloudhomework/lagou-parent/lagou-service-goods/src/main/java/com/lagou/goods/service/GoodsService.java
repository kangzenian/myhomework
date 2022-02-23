package com.lagou.goods.service;

import com.github.pagehelper.PageInfo;
import com.lagou.comment.pojo.Goods;
import com.lagou.comment.pojo.GoodsVO;


/**
* @author kangzenian
* @description 针对表【goods(商品表)】的数据库操作Service
* @createDate 2022-02-17 13:33:15
*/
public interface GoodsService {

    // 根据id查询商品
    public Goods selectByIdGoods(Integer id);

    // 通过id删除商品
    public int deleteById(Integer id);

    // 通过id编辑商品
    public int updateSelective(Goods goods);

    // 多条件分页查询商品
    public PageInfo<Goods> findAllByPage(GoodsVO goodsVO);

    // 根据订单id查询商品列表
    public Goods selectByOrderId(Integer orderId);
}
