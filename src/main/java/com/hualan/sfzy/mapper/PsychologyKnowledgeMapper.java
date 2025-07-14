package com.hualan.sfzy.mapper;

import com.hualan.sfzy.model.entity.PsychologyKnowledge;
import com.hualan.sfzy.model.vo.PsychologyKnowledgeQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 夏俊丰
* @description 针对表【psychology_knowledge】的数据库操作Mapper
* @createDate 2025-07-03 19:43:53
* @Entity com.hualan.domain.PsychologyKnowledge
*/
@Mapper
public interface PsychologyKnowledgeMapper {

    int insertSelective(PsychologyKnowledge record);//根据id插入信息

    PsychologyKnowledge selectByPrimaryKey(Integer id);//根据id查询信息

    int updateByPrimaryKeySelective(PsychologyKnowledge record);//根据id更新信息

    int deleteLogic(Integer id);//逻辑删除

    int deleteMultiple (Integer[] ids);//批量逻辑删除

    List<PsychologyKnowledge> selectMultiple(PsychologyKnowledgeQuery query);//多表联查

}
