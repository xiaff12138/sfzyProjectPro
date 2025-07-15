package com.hualan.sfzy.model.dto;

import com.hualan.sfzy.model.entity.Points;
import com.hualan.sfzy.model.entity.SystemUsers;
import lombok.Data;

@Data
public class PointsDTO {
    private Points points;
    private SystemUsers users;
} 