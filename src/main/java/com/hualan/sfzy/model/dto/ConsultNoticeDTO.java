package com.hualan.sfzy.model.dto;

import com.hualan.sfzy.model.entity.ConsultNotice;
import com.hualan.sfzy.model.entity.Consult;
import lombok.Data;

@Data
public class ConsultNoticeDTO {
    private ConsultNotice consultNotice;
    private Consult consult;
} 