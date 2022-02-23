package com.lagou.comment.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class GoodsVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品分类
     */
    private String category;

    /**
     * 开始库存数
     */
    private Integer numBegin;

    /**
     * 结束库存数
     */
    private Integer numEnd;

    /**
     * 开始价格
     */
    private String priceBegin;

    /**
     * 结束价格
     */
    private String priceEnd;

    /**
     * 是否上架；0：上架，1：下架
     */
    private Integer ison;

    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 每页显示条数
     */
    private Integer pageSize;

}
