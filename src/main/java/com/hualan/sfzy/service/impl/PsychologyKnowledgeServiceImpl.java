package com.hualan.sfzy.service.impl;


import com.hualan.sfzy.model.entity.PsychologyKnowledge;
import com.hualan.sfzy.mapper.PsychologyKnowledgeMapper;
import com.hualan.sfzy.service.PsychologyKnowledgeService;
import com.hualan.sfzy.model.vo.PsychologyKnowledgeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 心理知识服务实现类
 */
@Service
public class PsychologyKnowledgeServiceImpl implements PsychologyKnowledgeService {

    @Autowired
    private PsychologyKnowledgeMapper psychologyKnowledgeMapper;

    @Override
    public int insertSelective(PsychologyKnowledge record) {
        return psychologyKnowledgeMapper.insertSelective(record);
    }

    @Override
    public PsychologyKnowledge selectByPrimaryKey(Integer id) {
        return psychologyKnowledgeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PsychologyKnowledge record) {
        return psychologyKnowledgeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteLogic(Integer id) {
        return psychologyKnowledgeMapper.deleteLogic(id);
    }

    @Override
    public int deleteMultiple(Integer[] ids) {

        return psychologyKnowledgeMapper.deleteMultiple(ids);
    }

    @Override
    public List<PsychologyKnowledge> selectMultiple(PsychologyKnowledgeQuery query) {
        return psychologyKnowledgeMapper.selectMultiple(query);
    }
}