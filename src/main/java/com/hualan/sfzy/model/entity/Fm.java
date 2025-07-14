package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// Fm表
public class Fm {
    /**
     * fmid
     */

    private Integer id;

    /**
     * fm标题
     */
    private String title;

    /**
     * 外键 fm分类id
     */
    private Integer fmId;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer fmDel;

    /**
     * 缩略图
     */
    private String url;
}