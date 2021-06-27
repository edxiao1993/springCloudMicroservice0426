package org.kevin.controller;

import org.kevin.dto.ParameterParser;
import org.kevin.model.Article;
import org.kevin.model.ArticleType;
import org.kevin.model.dto.PageModel;
import org.kevin.service.ArticleService;
import org.kevin.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/6/22
 */
@Controller
public class ArticleController {
    @Autowired
    private RabbitMQService rabbitMQService;

    @Autowired
    private ArticleService articleService;

    @GetMapping("/newArticle")
    public String newArticle(ModelMap modelMap) {
        List<ArticleType> articleTypes = articleService.getArticleType();
        modelMap.addAttribute("articleTypes", articleTypes);
        return "newArticle";
    }

    @GetMapping("/articles")
    public String articles(@RequestParam("articleType") Integer type,
                           @RequestParam(value = "pageNum", required = false) Integer pageNum,
                           @RequestParam(value = "pageSize", required = false) Integer pageSize,
                           ModelMap modelMap) {
        ParameterParser pp = new ParameterParser(pageNum, pageSize);
        pp.setArticleType(type);

        List<Article> articles = articleService.getArticleWithTypes(pp);
        long count = articleService.countArticleByArticleType(type).getData();
        PageModel pageModel = new PageModel(pageNum, pageSize, count);

        modelMap.addAttribute("pageModel", pageModel);
        modelMap.addAttribute("articles", articles);
        modelMap.addAttribute("articleType", type);

        return "blogWithType";
    }

    @GetMapping("/article")
    public String article(@RequestParam("id") String id, ModelMap modelMap) {
        List<ArticleType> articleTypes = articleService.getArticleType();
        modelMap.addAttribute("articleTypes", articleTypes);

        Article article = articleService.getArticleById(id);
        modelMap.addAttribute("article", article);
        return "blog";
    }

    @PostMapping("/saveArticle")
    @ResponseBody
    public Integer saveArticle(Article article) {
        article.setCreateTime(null);
        rabbitMQService.sendArticle(article);
        return articleService.saveArticle(article);
    }
}
