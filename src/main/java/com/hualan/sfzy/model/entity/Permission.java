package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

// 菜单权限表
public class Permission {
    private Integer id;
    private String name;
    private  Integer type;
    private String url;
    private String percode;
    private Integer parentId;
    private String sort;
    private Integer del;


}
