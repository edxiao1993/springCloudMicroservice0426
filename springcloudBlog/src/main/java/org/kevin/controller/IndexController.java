package org.kevin.controller;

import org.kevin.model.Article;
import org.kevin.model.ArticleType;
import org.kevin.model.dto.PageModel;
import org.kevin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/3/10
 */
@Controller
public class IndexController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = {"/index", "/"})
    public String index(ModelMap modelMap) {
        List<ArticleType> articleTypeList = articleService.getArticleType();
        List<Article> articleList = articleService.getArticles(null);
        modelMap.addAttribute("articleTypes", articleTypeList);
        modelMap.addAttribute("articles", articleList);
        return "index";
    }
}
