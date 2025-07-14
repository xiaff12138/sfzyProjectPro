package com.hualan.sfzy.service;


import com.hualan.sfzy.model.entity.Article;
import com.hualan.sfzy.model.vo.ArticleQuery;

import java.util.List;

public interface ArticleService {
    int deleteByPrimaryKey(Integer id);//逻辑删除文章

    int insert(Article record);//新增文章

    Article selectByPrimaryKey(Integer id);

    List<Article> selectMultiple(ArticleQuery query);//根据文章的文章名、作者、分类进行多条件查询

    int updateByPrimaryKeySelective(Article record);//编辑文章内容

    int  deleteMultiple(Integer[] ids);//批量删除功能

    // 新增DTO相关方法
    com.hualan.sfzy.model.dto.ArticleDTO selectDTOByPrimaryKey(Integer id);
    java.util.List<com.hualan.sfzy.model.dto.ArticleDTO> selectMultipleDTO(com.hualan.sfzy.model.vo.ArticleQuery query);
}