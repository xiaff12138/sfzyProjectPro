package com.hualan.sfzy.service;


import com.hualan.sfzy.model.entity.FmClassify;

import java.util.List;

/**
 * FM分类服务接口
 */
public interface FmClassifyService {

    /**
     * 逻辑批量删除
     * @param ids FM分类ID数组
     */
    int deleteMultiple(Integer[] ids);

    /**
     * 新增分类
     */
    int insertSelective(FmClassify record);

    /**
     * 根据ID查询分类信息
     */
    FmClassify selectByPrimaryKey(Integer id);

    /**
     * 根据ID编辑分类
     */
    int updateByPrimaryKeySelective(FmClassify record);

    /**
     * 根据ID逻辑删除
     * @param id FM分类ID
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 根据分类名模糊查询
     */
    List<FmClassify> selectByClassifyName(String classifyName);
}