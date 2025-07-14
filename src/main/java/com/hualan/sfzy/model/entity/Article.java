package com.hualan.sfzy.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 文章表
public class Article {

    /**
     * 文章编号
     */

    private Integer id;

    /**
     * 文章名
     */
    private String articleName;

    /**
     * 文章简介
     */
    private String articleIntroduction;

    /**
     * 外键 心理导师id
     */
    private Integer consultId;

    /**
     * 缩略图
     */
    private String url;

    /**
     * 详细内容
     */
    private String content;

    /**
     * 阅读量
     */
    private Integer viewCount;

    /**
     * 外键 文章分类id
     */
    private Integer classifyId;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date articleTime;

    /**
     * 审核状态：0审核中 1已审核 2未通过审核
     */
    private Integer status;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer del;
}