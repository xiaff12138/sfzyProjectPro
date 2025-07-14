package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 咨询师表
public class Consult {
    /**
     *
     */

    private Integer id;

    /**
     * 咨询师姓名
     */
    private String consultName;

    /**
     * 外键 咨询师等级
     */
    private Integer consultGrade;

    /**
     * 咨询师手机号
     */
    private String mobile;

    /**
     * 性别：0男性 1女性
     */
    private Integer sex;

    /**
     * 证书图片URL
     */
    private String certImg;

    /**
     * 咨询师地址
     */
    private String address;

    /**
     * 咨询师简介
     */
    private String introduction;

    /**
     * 咨询师职位
     */
    private String job;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer consultDel;
}
