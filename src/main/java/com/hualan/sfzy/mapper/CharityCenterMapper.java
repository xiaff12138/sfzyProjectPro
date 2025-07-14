package com.hualan.sfzy.mapper;

import com.hualan.sfzy.model.entity.CharityCenter;
import com.hualan.sfzy.model.vo.CharityCenterQuery;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
* @author 夏俊丰
* @description 针对表【charity_center】的数据库操作Mapper
* @createDate 2025-07-03 19:43:53
* @Entity com.hualan.domain.CharityCenter
*/
@Mapper
public interface CharityCenterMapper {


    int insertSelective(CharityCenter record); //插入信息

    CharityCenter selectByPrimaryKey(Integer id);//根据id查询信息

    int updateByPrimaryKeySelective(CharityCenter record);//根据id更新信息

   int deleteLogic(Integer id);//逻辑删除

   int deleteMultiple (Integer[] ids);//逻辑批量删除

    List<CharityCenter> selectMultiple(CharityCenterQuery query);//多表联查模糊查询
}
