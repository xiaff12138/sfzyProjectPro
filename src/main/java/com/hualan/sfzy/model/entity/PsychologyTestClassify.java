package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 心理测试分类表
public class PsychologyTestClassify {
    private Integer id;
    private String classifyName;
    private String url;
    private Integer del;
}
