package org.kevin.service;

import org.kevin.model.Article;
import org.kevin.model.ArticleType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/6/22
 */
@FeignClient(value = "dataservice")
public interface ArticleService {

    @GetMapping(value = "/article/selectArticleWithLimit")
    public List<Article> getArticles(@RequestParam("limit") Integer limit);

    @GetMapping(value = "/article/selectArticleWithType")
    public List<Article> getArticleWithTypes();

    @GetMapping(value = "/article/selectArticleById")
    public Article getArticleById(@RequestParam("id") String id);

    @GetMapping(value = "article/selectArticleType")
    public List<ArticleType> getArticleType();
}
