package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 公司表
public class Company {
    private Integer id;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private String description;
    private String erCode;


}
