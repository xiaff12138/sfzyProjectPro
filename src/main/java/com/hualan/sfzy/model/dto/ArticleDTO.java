package com.hualan.sfzy.model.dto;

import com.hualan.sfzy.model.entity.Article;
import com.hualan.sfzy.model.entity.ArticleClassify;
import com.hualan.sfzy.model.entity.Consult;
import lombok.Data;

@Data
public class ArticleDTO {
    private Article article;
    private ArticleClassify articleClassify;
    private Consult consult;
} 