package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 咨询师订单表
public class ConsultOrder {
    /**
     *
     */

    private Integer id;

    /**
     * 外键 收费标准id
     */
    private Integer chargesid;

    /**
     * 外键 咨询师id
     */
    private Integer consultid;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 咨询预约时间
     */
    private Date reservationTime;

    /**
     * 实付金额
     */
    private Double price;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer del;
}

