package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 咨询师等级表
public class ConsultGrade {
    private Integer id;
    private String gradeName;
    private Integer del;
}
