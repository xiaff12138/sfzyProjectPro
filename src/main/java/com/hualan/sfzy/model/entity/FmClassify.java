package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// Fm分类表
public class FmClassify {
    /**
     * 分类主键
     */

    private Integer id;

    /**
     * 分类名
     */
    private String classifyName;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer del;
}