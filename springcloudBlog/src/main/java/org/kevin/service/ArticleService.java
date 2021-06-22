package org.kevin.service;

import org.kevin.dto.ParameterParser;
import org.kevin.model.Article;
import org.kevin.model.ArticleType;
import org.kevin.model.dto.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public List<Article> getArticleWithTypes(@SpringQueryMap ParameterParser parameterParser);

    @GetMapping(value = "/article/countArticleWithArticleType")
    public ResultData<Long> countArticleByArticleType(@RequestParam("articleType") Integer articleType);

    @GetMapping(value = "/article/selectArticleById")
    public Article getArticleById(@RequestParam("id") String id);

    @GetMapping(value = "/article/selectArticleType")
    public List<ArticleType> getArticleType();

    @PostMapping(value = "/article/save")
    public Integer saveArticle(@SpringQueryMap Article article);
}
