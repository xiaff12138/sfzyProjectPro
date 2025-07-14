package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 课程分类表
public class CourseClassify {
    private Integer id;
    private String classifyName;
    private String classifyIcon;
    private Integer del;
}
