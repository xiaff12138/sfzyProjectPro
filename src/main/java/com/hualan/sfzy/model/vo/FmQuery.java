package com.hualan.sfzy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FmQuery {
    /**
     * fm标题
     */
    private String title;

    /**
     * 分类ID
     */
    private Integer classifyId;
} 