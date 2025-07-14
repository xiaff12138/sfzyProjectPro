package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
// 咨询师留言表
public class ConsultMessage {
    private Integer id;
    private String content;
    private String reply;
    private Integer userid;
    private Integer consultid;
    private Integer del;
}
