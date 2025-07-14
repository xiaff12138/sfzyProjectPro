package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 咨询师擅长领域表中间表
public class ConsultExpertise {
    private Integer id;
    private Integer consultid;
    private Integer expertiseid;
    private Integer del;
}
