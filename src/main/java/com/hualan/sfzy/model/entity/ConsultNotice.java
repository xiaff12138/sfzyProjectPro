package com.hualan.sfzy.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 咨询公告表
public class ConsultNotice {
    /**
     * 咨询公告id
     */

    private Integer id;

    /**
     * 公告名
     */
    private String noticeName;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 缩略图
     */
    private String url;

    /**
     * 发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date noticeTime;

    /**
     * 外键 管理员id
     */
    private Integer userId;

    /**
     * 是否删除：0正常 1删除
     */
    private Integer del;

}