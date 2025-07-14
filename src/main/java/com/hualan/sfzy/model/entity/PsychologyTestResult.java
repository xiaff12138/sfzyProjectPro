package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 心理测试结果表
public class PsychologyTestResult {
    private Integer id;
    private int score;
    private String content;
    private Integer psychologyTestId;
    private Integer userId;
    private Date testTime;
    private Integer del;
}
