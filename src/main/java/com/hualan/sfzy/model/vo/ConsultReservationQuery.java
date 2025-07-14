package com.hualan.sfzy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultReservationQuery {
    /**
     * 用户名
     */
    private String username;

    /**
     * 咨询师名
     */
    private String consultName;
} 