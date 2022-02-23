package com.lagou.comment.pojo;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单表表
 * @TableName orders
 */

@Data
@Table(name = "orders")
public class Orders implements Serializable {
    /**
     * 订单id
     */
    private Integer id;

    /**
     * 商品id，外键
     */
    private Integer gid;

    /**
     * 订单编号
     */
    private String number;

    /**
     * 订单状态；0：未支付，1：已支付，2：已失效，3：已删除
     */
    private Integer status;

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