package com.hualan.sfzy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ArticleQuery {
    /**
     * 文章名称
     */
    private String articleName;

    /**
     * 作者ID
     */
    private Integer authorId;

    /**
     * 分类ID
     */
    private Integer classifyId;
}