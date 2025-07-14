package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 课程收藏表
public class CourseCollect {
    private Integer id;
    private Integer courseId;
    private Integer userId;
    private Integer del;
}
