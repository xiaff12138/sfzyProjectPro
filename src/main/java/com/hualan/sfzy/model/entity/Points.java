package com.hualan.sfzy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//积分表
public class Points {
    private Integer id;
    private Integer user_id;
    private Integer points;
    private SystemUsers users;

}
