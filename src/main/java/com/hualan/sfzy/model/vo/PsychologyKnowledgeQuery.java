package com.hualan.sfzy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PsychologyKnowledgeQuery {
    /**
     * 标题
     */
    private String title;

    /**
     * 咨询师ID
     */
    private Integer consultId;
} 