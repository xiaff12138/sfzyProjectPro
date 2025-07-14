package com.hualan.sfzy.mapper;


import com.hualan.sfzy.model.entity.FmClassify;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 夏俊丰
* @description 针对表【fm_classify】的数据库操作Mapper
* @createDate 2025-07-03 19:43:53
* @Entity com.hualan.domain.FmClassify
*/
@Mapper
public interface FmClassifyMapper {

    int deleteMultiple(Integer[] ids);//逻辑批量删除

    int insertSelective(FmClassify record);//新增分类

    FmClassify selectByPrimaryKey(Integer id);///根据id查询分类信息

    int updateByPrimaryKeySelective(FmClassify record);//根据id编辑分类

    int deleteByPrimaryKey(Integer  id);//根据id逻辑删除

    List<FmClassify>selectByClassifyName(String classifyName);//根据分类名模糊查询
}
