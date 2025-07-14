package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 问题表
public class Question {
    private Integer id;
    private String title;
    private String content;
    private Integer userId;
    private Date questionTime;
    private Integer del;
}
