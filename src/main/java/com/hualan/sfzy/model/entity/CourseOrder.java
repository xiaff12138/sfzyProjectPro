package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 课程订单表
public class CourseOrder {
    private Integer id;
    private Integer courseId;
    private Integer userId;
    private Date orderTime;
    private Integer orderType;
    private Double price;
    private Integer del;
}
