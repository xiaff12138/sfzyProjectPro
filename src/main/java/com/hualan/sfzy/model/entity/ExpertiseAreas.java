package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 咨询师 擅长领域表
public class ExpertiseAreas {
    private Integer id;
    private String expertise;
    private Integer del;
}
