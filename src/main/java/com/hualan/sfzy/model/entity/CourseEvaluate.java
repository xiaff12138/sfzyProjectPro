package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 课程评价表
public class CourseEvaluate {

    private Integer id;
    private String evaluateContent;
    private Integer score;
    private Date evaluateTime;
    private Integer userId;
    private Integer courseId;
    private Integer del;
}
