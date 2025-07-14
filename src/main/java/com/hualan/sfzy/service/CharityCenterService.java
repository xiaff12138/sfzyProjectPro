package com.hualan.sfzy.service;


import com.hualan.sfzy.model.entity.CharityCenter;
import com.hualan.sfzy.model.vo.CharityCenterQuery;

import java.util.List;

/**
 * 公益中心服务接口
 */
public interface CharityCenterService {

    /**
     * 插入公益中心信息
     */
    int insertSelective(CharityCenter record);

    /**
     * 根据id查询公益中心信息
     */


    CharityCenter selectByPrimaryKey(Integer id);

    /**
     * 根据id更新公益中心信息
     * @param record 公益中心信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(CharityCenter record);

    /**
     * 逻辑删除公益中心信息
     */
    int deleteLogic(Integer id);

    /**
     * 批量逻辑删除公益中心信息
     */
    int deleteMultiple(Integer[] ids);

    /**
     * 多条件查询公益中心信息
     */
    List<CharityCenter> selectMultiple(CharityCenterQuery query);
}