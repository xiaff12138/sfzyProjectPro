package com.hualan.sfzy.mapper;


import com.hualan.sfzy.model.entity.Fm;
import com.hualan.sfzy.model.vo.FmQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 夏俊丰
* @description 针对表【fm】的数据库操作Mapper
* @createDate 2025-07-05 17:57:34
* @Entity com.hualan.domain.Fm
*/
@Mapper

public interface FmMapper {


    int insertSelective(Fm record);//插入fm数据

    Fm selectByPrimaryKey(Integer id);//根据id查询数据

    int updateByPrimaryKeySelective(Fm record);//更新数据

    int deleteLogic(Integer id);//逻辑删除数据

    int deleteMultiple(Integer[] ids);//逻辑批量删除数据

    List<Fm> selectMultiple(FmQuery query);//多条件模糊查询
}
