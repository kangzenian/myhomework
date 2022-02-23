package com.lagou.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.comment.pojo.Goods;
import com.lagou.comment.pojo.GoodsVO;
import com.lagou.goods.mapper.GoodsMapper;
import com.lagou.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author kangzenian
* @description 针对表【goods(商品表)】的数据库操作Service实现
* @createDate 2022-02-17 13:33:15
*/
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     *  根据id查询商品
     */
    @Override
    public Goods selectByIdGoods(Integer id) {
        return goodsMapper.selectByIdGoods(id);
    }

    /**
     * 通过id删除商品
     */
    @Override
    public int deleteById(Integer id) {
        return goodsMapper.deleteById(id);
    }

    /**
     * 通过id编辑商品
     */
    @Override
    public int updateSelective(Goods goods) {
        return goodsMapper.updateSelective(goods);
    }

    /**
     * 多条件分页查询商品
     */
    @Override
    public PageInfo<Goods> findAllByPage(GoodsVO goodsVO) {

        // 分页查询
        PageHelper.startPage(goodsVO.getCurrentPage(), goodsVO.getPageSize());
        List<Goods> goodsList = goodsMapper.findAllByPage(goodsVO);
        PageInfo<Goods> PageInfo = new PageInfo<>(goodsList);
        return PageInfo;
    }

    /**
     * 根据订单id查询商品列表
     */
    @Override
    public Goods selectByOrderId(Integer orderId) {

        System.out.println(9201);
        return goodsMapper.selectByOrderId(orderId);
    }
}
