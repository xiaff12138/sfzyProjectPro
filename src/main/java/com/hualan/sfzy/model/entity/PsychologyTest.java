package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 心理测试表
public class PsychologyTest {
    private Integer id;
    private String titleId;
    private String introduction;
    private String url;
    private String aboutTest;
    private String obtain;
    private String suitable;
    private String document;
    private Double beforePrice;
    private Double price;
    private Integer testClassifyId;
    private Integer del;
}
