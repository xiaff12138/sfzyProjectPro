package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 咨询师收费分类表
public class ConsultChargesClassify {
    private Integer id;
    private String classifyname;
    private Integer del;
}
