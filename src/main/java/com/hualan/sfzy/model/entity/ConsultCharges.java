package com.hualan.sfzy.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 咨询师收费标准表
public class ConsultCharges {
    private Integer id;
    private Integer chargesid;
    private Integer consultid;
    private Double price;
    private Integer number;
    private Integer del;
}
