package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//角色权限中间表
public class RolePermission {
    private Integer id;
    private Integer roleId;
    private Integer permissionId;
    private Integer del;
    private Role role;
    private Permission permission;
}
