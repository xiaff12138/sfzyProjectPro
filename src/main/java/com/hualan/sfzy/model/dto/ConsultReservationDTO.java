package com.hualan.sfzy.model.dto;

import com.hualan.sfzy.model.entity.ConsultReservation;
import com.hualan.sfzy.model.entity.Consult;
import com.hualan.sfzy.model.entity.SystemUsers;
import lombok.Data;

@Data
public class ConsultReservationDTO {
    private ConsultReservation consultReservation;
    private Consult consult;
    private SystemUsers systemUsers;
} 