package com.hualan.sfzy.mapper;


import com.hualan.sfzy.model.entity.ArticleClassify;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 夏俊丰
* @description 针对表【article_classify】的数据库操作Mapper
* @createDate 2025-07-03 19:43:53
* @Entity com.hualan.domain.ArticleClassify
*/
@Mapper
public interface ArticleClassifyMapper {

    int deleteByPrimaryKey(Integer id);//<!--逻辑删除文章分类-->

    int insert(ArticleClassify record);///新增文章分类

    ArticleClassify selectByPrimaryKey(Integer id);//根据id查询

    List<ArticleClassify> selectByClassifyName(String classifyName);//根据分类名模糊查询

    int updateByPrimaryKeySelective(ArticleClassify record);//根据id更新信息

    int  deleteMultiple(Integer[] ids);//逻辑批量删除

}
