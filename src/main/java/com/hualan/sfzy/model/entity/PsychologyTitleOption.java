package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 心理测试标题选项表
public class PsychologyTitleOption {
    private Integer id;
    private String content;
    private Integer testTitleId;
    private Integer del;
}
