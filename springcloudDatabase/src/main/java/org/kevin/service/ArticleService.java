package org.kevin.service;

import org.kevin.model.Article;

import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/3/29
 */
public interface ArticleService {
    List<Article> findList();

    List<Article> findList(Integer limit);

    List<Article> findList(Integer page, Integer limit);

    List<Article> selectByTypes(Integer articleType, Integer page, Integer limit);

    Article selectById(String id);

    long count(int articleType);

    int insert(Article article);
}
