package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 课程表
public class Course {
    private Integer id;
    private String courseName;
    private String thumbnail;
    private Long courseTime;
    private Integer videoNumber;
    private Integer studyNumber;
    private String courseIntroduction;
    private String applyPeople;
    private String studyGet;
    private String subscribeNotice;
    private Double beforePrice;
    private Double nowPrice;
    private Double courseDiscount;
    private Integer courseClassify;
    private Integer consultId;
    private Integer del;
}
