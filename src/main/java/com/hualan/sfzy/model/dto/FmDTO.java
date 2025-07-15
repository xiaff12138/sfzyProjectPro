package com.hualan.sfzy.model.dto;

import com.hualan.sfzy.model.entity.Fm;
import com.hualan.sfzy.model.entity.FmClassify;
import lombok.Data;

@Data
public class FmDTO {
    private Fm fm;
    private FmClassify fmClassify;
} 