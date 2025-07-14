package com.hualan.sfzy.mapper;

import com.hualan.sfzy.model.entity.Article;
import com.hualan.sfzy.model.vo.ArticleQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;



/**
* @author 夏俊丰
* @description 针对表【article】的数据库操作Mapper
* @createDate 2025-07-03 19:43:53
* @Entity com.hualan.domain.Article
*/
@Mapper
public interface ArticleMapper {

    int deleteByPrimaryKey(Integer id);//逻辑删除文章

    int insert(Article record);//新增文章

    Article selectByPrimaryKey(Integer id);//根据文章的id查询文章

    List<Article> selectMultiple(ArticleQuery query);//根据文章的文章名、作者、分类进行多条件查询

    int updateByPrimaryKeySelective(Article record);//编辑文章内容

    int   deleteMultiple (Integer[] ids);//批量删除功能

}
