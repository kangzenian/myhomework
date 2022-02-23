package com.lagou.comment.pojo;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品表
 * @TableName goods
 */
@Data
@Table(name = "goods")
public class Goods implements Serializable {
    /**
     * 商品id
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品分类
     */
    private String category;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 库存
     */
    private Integer num;

    /**
     * 价格
     */
    private String price;

    /**
     * 是否上架；0：上架，1：下架
     */
    private Integer ison;

    /**
     * 删除；0：未删除，1：已删除
     */
    private Integer isdel;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

}