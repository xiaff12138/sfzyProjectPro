package com.hualan.sfzy.service.impl;

import com.hualan.sfzy.model.entity.Article;
import com.hualan.sfzy.mapper.ArticleMapper;
import com.hualan.sfzy.service.ArticleService;
import com.hualan.sfzy.model.vo.ArticleQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Article record) {
        return articleMapper.insert(record);
    }


    @Override
    public Article selectByPrimaryKey(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Article> selectMultiple(ArticleQuery query) {
        return articleMapper.selectMultiple(query);
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteMultiple(Integer[] ids) {

        return  articleMapper.deleteMultiple(ids);
    }
}