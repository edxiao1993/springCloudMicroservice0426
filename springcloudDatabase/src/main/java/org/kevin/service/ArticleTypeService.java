package org.kevin.service;

import org.kevin.model.ArticleType;

import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/3/29
 */
public interface ArticleTypeService {
    List<ArticleType> findList();
}
