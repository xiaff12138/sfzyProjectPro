package com.hualan.sfzy.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 心理知识表
public class PsychologyKnowledge {

    /**
     * 心理知识id
     */

    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 缩略图
     */
    private String url;

    /**
     * 详细内容
     */
    private String content;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date psychologyTime;

    /**
     * 外键 咨询师id
     */
    private Integer consultId;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer del;

}