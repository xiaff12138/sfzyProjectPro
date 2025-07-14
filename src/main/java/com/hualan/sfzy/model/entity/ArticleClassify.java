package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 文章分类表
public class ArticleClassify {
    private Integer id;

    /**
     * 文章分类表：0心理咨询 1缓解焦虑 2情感危机 3改善人际 4个人成长
     */
    private String classifyName;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer articleClassifyDel;
}