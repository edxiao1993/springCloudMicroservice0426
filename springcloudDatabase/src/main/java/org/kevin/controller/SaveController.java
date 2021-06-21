package org.kevin.controller;

import org.kevin.model.Article;
import org.kevin.model.dto.ResultData;
import org.kevin.service.ArticleService;
import org.kevin.service.SecretMomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin.Z
 * @version 2021/3/29
 */
@RestController
public class SaveController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private SecretMomentService secretMomentService;

    @RequestMapping("saveArticle")
    public int saveArticle(Article article){
        return articleService.insert(article);
    }

    @RequestMapping("saveSecretMoment")
    public ResultData<Integer> saveSecretMoment(@RequestParam(value = "content", required = false) String content){
        ResultData<Integer> resultData = new ResultData<>();
        if(!StringUtils.isEmpty(content)){
            resultData.setData(secretMomentService.insertNewRecord(content));
        }
        return resultData;
    }
}
