package com.hualan.sfzy.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 咨询师预约表
public class ConsultReservation {
    /**
     * 咨询预约id
     */

    private Integer id;

    /**
     * 咨询预约时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date reservationTime;

    /**
     * 情况说明
     */
    private String situationDesc;

    /**
     * 外键 用户id
     */
    private Integer userId;

    /**
     * 外键 咨询师id
     */
    private Integer consultId;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer del;

}