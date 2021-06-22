package org.kevin.controller;

import org.kevin.model.Article;
import org.kevin.model.ArticleType;
import org.kevin.model.dto.ResultData;
import org.kevin.service.ArticleService;
import org.kevin.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/6/22
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ArticleTypeService articleTypeService;

    @RequestMapping("/selectArticleWithLimit")
    public List<Article> selectArticleWithLimit(
            @RequestParam(value = "limit", required = false) Integer limit) {
        return articleService.findList(limit);
    }

    @RequestMapping("/selectArticleWithType")
    public List<Article> selectArticleWithType(
            @RequestParam("articleType") Integer articleType,
            @RequestParam(value = "pageNum", required = false) Integer pageNum,
            @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        return articleService.selectByTypes(articleType, pageNum, pageSize);
    }

    @RequestMapping("/countArticleByArticleType")
    public ResultData<Long> countArticleByArticleType(@RequestParam("articleType") Integer articleType) {
        ResultData<Long> resultData = new ResultData<>();
        resultData.setData(articleService.count(articleType));
        return resultData;
    }

    @RequestMapping("/selectArticleById")
    public Article selectArticleById(@RequestParam("id") String id) {
        return articleService.selectById(id);
    }

    @RequestMapping("/selectArticleType")
    public List<ArticleType> selectArticleType() {
        return articleTypeService.findList();
    }

    @PostMapping("/save")
    public Integer save(Article article){
        return articleService.insert(article);
    }
}
