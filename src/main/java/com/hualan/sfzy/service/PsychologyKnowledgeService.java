package com.hualan.sfzy.service;


import com.hualan.sfzy.model.entity.PsychologyKnowledge;
import com.hualan.sfzy.model.vo.PsychologyKnowledgeQuery;

import java.util.List;

/**
 * 心理知识服务接口
 */
public interface PsychologyKnowledgeService {

    /**
     * 新增心理知识
     */
    int insertSelective(PsychologyKnowledge record);

    /**
     * 根据ID查询心理知识
     */
    PsychologyKnowledge selectByPrimaryKey(Integer id);

    /**
     * 根据ID更新心理知识
     */
    int updateByPrimaryKeySelective(PsychologyKnowledge record);

    /**
     * 根据ID逻辑删除心理知识
     */
    int deleteLogic(Integer id);

    /**
     * 批量逻辑删除心理知识
     * @param ids 心理知识ID数组
     * @return 影响行数
     */
    int deleteMultiple(Integer[] ids);

    /**
     * 多条件查询心理知识
     */
    List<PsychologyKnowledge> selectMultiple(PsychologyKnowledgeQuery query);
}