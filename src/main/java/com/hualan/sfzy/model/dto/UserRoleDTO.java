package com.hualan.sfzy.model.dto;

import com.hualan.sfzy.model.entity.UserRole;
import com.hualan.sfzy.model.entity.SystemUsers;
import com.hualan.sfzy.model.entity.Role;
import lombok.Data;

@Data
public class UserRoleDTO {
    private UserRole userRole;
    private SystemUsers user;
    private Role role;
} 