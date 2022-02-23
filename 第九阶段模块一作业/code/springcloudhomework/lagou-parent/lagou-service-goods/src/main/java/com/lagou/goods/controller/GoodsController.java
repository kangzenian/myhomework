package com.lagou.goods.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.comment.pojo.Goods;
import com.lagou.comment.pojo.GoodsVO;
import com.lagou.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 根据id查询商品
     */
    @GetMapping("/findById/{id}")
    public Goods findById(@PathVariable Integer id) {

        return goodsService.selectByIdGoods(id);
    }

    /**
     * 通过id删除商品
     */
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id) {

        int row = goodsService.deleteById(id);
        if (1 == row) {
            return "删除成功";
        }
        return "删除失败";
    }

    /**
     * 通过id编辑商品
     */
    @PostMapping("/updateById")
    public String updateById(@RequestBody Goods goods) {

        int row = goodsService.updateSelective(goods);
        if (1 == row) {
            return "修改成功";
        }
        return "修改失败";
    }

    /**
     * 多条件分页查询商品
     */
    @PostMapping("/findAllByPage")
    private Map<String, Object> findAllByPage(@RequestBody GoodsVO goodsVO) {

        PageInfo<Goods> pageInfo = goodsService.findAllByPage(goodsVO);

        Map<String, Object> map = new HashMap<>();
        map.put("list", pageInfo.getList());
        map.put("total", pageInfo.getTotal());

        return map;
    }

    /**
     * 根据订单id查询商品列表
     */
    @GetMapping("/findByOrderId/{orderId}")
    public Goods findByOrderId(@PathVariable Integer orderId) {
        return goodsService.selectByOrderId(orderId);
    }
}
