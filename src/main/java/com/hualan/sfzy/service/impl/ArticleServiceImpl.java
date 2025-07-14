package com.hualan.sfzy.service.impl;

import com.hualan.sfzy.model.entity.Article;
import com.hualan.sfzy.mapper.ArticleMapper;
import com.hualan.sfzy.service.ArticleService;
import com.hualan.sfzy.model.vo.ArticleQuery;
import com.hualan.sfzy.model.dto.ArticleDTO;
import com.hualan.sfzy.model.entity.ArticleClassify;
import com.hualan.sfzy.model.entity.Consult;
import com.hualan.sfzy.mapper.ArticleClassifyMapper;
import com.hualan.sfzy.mapper.ConsultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleClassifyMapper articleClassifyMapper;
    @Autowired
    private ConsultMapper consultMapper;

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

    @Override
    public ArticleDTO selectDTOByPrimaryKey(Integer id) {
        Article article = articleMapper.selectByPrimaryKey(id);
        if (article == null) return null;
        ArticleDTO dto = new ArticleDTO();
        dto.setArticle(article);
        ArticleClassify classify = articleClassifyMapper.selectByPrimaryKey(article.getClassifyId());
        dto.setArticleClassify(classify);
        Consult consult = consultMapper.selectByPrimaryKey(article.getConsultId());
        dto.setConsult(consult);
        return dto;
    }

    @Override
    public List<ArticleDTO> selectMultipleDTO(ArticleQuery query) {
        List<Article> articles = articleMapper.selectMultiple(query);
        List<ArticleDTO> dtos = new java.util.ArrayList<>();
        for (Article article : articles) {
            ArticleDTO dto = selectDTOByPrimaryKey(article.getId());
            if (dto != null) dtos.add(dto);
        }
        return dtos;
    }
}