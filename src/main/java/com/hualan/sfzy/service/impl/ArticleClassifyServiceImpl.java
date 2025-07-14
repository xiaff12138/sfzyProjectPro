package com.hualan.sfzy.service.impl;


import com.hualan.sfzy.model.entity.ArticleClassify;
import com.hualan.sfzy.mapper.ArticleClassifyMapper;
import com.hualan.sfzy.service.ArticleClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章分类服务实现类
 */
@Service
public class ArticleClassifyServiceImpl implements ArticleClassifyService {

    @Autowired
    private ArticleClassifyMapper articleClassifyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return articleClassifyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ArticleClassify record) {
        return articleClassifyMapper.insert(record);
    }



    @Override
    public ArticleClassify selectByPrimaryKey(Integer id) {
        return articleClassifyMapper.selectByPrimaryKey(id);
    }

    @Override
    public  List<ArticleClassify> selectByClassifyName(String classifyName) {

        return articleClassifyMapper.selectByClassifyName(classifyName);
    }

    @Override
    public int updateByPrimaryKeySelective(ArticleClassify record) {
        return articleClassifyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteMultiple(Integer[] ids) {

        return articleClassifyMapper.deleteMultiple(ids);
       
    }
}