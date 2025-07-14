package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 咨询师评价表
public class ConsultEvaluate {
    private Integer id;
    private String content;
    private Integer score;
    private Date evaluate;          // 评价时间
    private Integer userid;
    private Integer consultid;
    private Integer del;
}
