package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 回复表
public class Answer {
    private Integer id;
    private String content;
    private Integer userId;
    private Integer questionId;
    private Date time;
    private Integer del;
}
