package com.hualan.sfzy.model.dto;

import com.hualan.sfzy.model.entity.PsychologyKnowledge;
import com.hualan.sfzy.model.entity.Consult;
import lombok.Data;

@Data
public class PsychologyKnowledgeDTO {
    private PsychologyKnowledge psychologyKnowledge;
    private Consult consult;
} 