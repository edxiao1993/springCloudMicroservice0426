package org.kevin.service.impl;

import org.kevin.mapper.ArticleTypeMapper;
import org.kevin.model.ArticleType;
import org.kevin.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/3/29
 */
@Service
public class ArticleTypeServiceImpl implements ArticleTypeService {
    @Autowired
    private ArticleTypeMapper articleTypeMapper;

    @Override
    public List<ArticleType> findList() {
        return articleTypeMapper.findList();
    }
}
