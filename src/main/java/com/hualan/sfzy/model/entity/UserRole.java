package com.hualan.sfzy.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 用户角色中间表
public class UserRole {
    private Integer id;
    private Integer userId;
    private Integer roleId;
    private Integer del;
}
