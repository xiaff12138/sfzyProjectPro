package com.hualan.sfzy.model.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//角色表
public class Role {
    private Integer id;
    private String roleCode;
    private String roleName;
    private String description;
    private Integer del;


}
