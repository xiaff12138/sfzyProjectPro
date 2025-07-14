package com.hualan.sfzy.service;


import com.hualan.sfzy.model.entity.Fm;
import com.hualan.sfzy.model.vo.FmQuery;

import java.util.List;

/**
 * FM服务接口
 */
public interface FmService {

    /**
     * 插入FM数据
     */
    int insertSelective(Fm record);

    /**
     * 根据ID查询FM数据
     */
    Fm selectByPrimaryKey(Integer id);

    /**
     * 更新FM数据
     */
    int updateByPrimaryKeySelective(Fm record);

    /**
     * 逻辑删除FM数据
     */
    int deleteLogic(Integer id);

    /**
     * 批量逻辑删除FM数据
     */
    int deleteMultiple(Integer[] ids);

    /**
     * 多条件模糊查询FM数据
     */
    List<Fm> selectMultiple(FmQuery query);
}