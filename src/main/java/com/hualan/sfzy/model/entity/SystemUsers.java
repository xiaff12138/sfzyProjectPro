package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 系统用户表
public class SystemUsers {
    private Integer id;
    private String username;
    private String userpwd;
    private String mobile;
    private String email;
    private String nickname;
    private String salt;
    private Integer del;

}
