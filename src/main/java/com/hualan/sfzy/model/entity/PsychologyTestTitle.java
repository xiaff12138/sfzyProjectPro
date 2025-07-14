package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 心理测试标题表
public class PsychologyTestTitle {
    private Integer id;
    private String title;
    private String titleId;
    private Integer del;
}
