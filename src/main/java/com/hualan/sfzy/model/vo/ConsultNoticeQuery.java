package com.hualan.sfzy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultNoticeQuery {
    /**
     * 公告名
     */
    private String noticeName;

    /**
     * 公告内容
     */
    private String content;
} 