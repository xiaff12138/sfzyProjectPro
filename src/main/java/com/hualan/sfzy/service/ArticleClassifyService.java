package com.hualan.sfzy.service;


import com.hualan.sfzy.model.entity.ArticleClassify;

import java.util.List;

/**
 * 文章分类服务接口
 */
public interface ArticleClassifyService {

    /**
     * 根据ID删除文章分类
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增文章分类
     */
    int insert(ArticleClassify record);

    /**
     * 根据ID查询文章分类
     */
    ArticleClassify selectByPrimaryKey(Integer id);

    /**
     * 根据分类名查询文章分类
     */
    List<ArticleClassify> selectByClassifyName(String classifyName);

    /**
     * 根据ID更新文章分类
     */
    int updateByPrimaryKeySelective(ArticleClassify record);

    /**
     * 批量删除文章分类
     */
    int deleteMultiple(Integer[] ids);
}