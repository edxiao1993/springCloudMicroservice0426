package org.kevin.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.kevin.common.CommonUtils;
import org.kevin.common.Constant;
import org.kevin.mapper.ArticleMapper;
import org.kevin.model.Article;
import org.kevin.model.ArticleExample;
import org.kevin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/3/29
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    private static final int DEFAULT_PAGE_SIZE = 23;

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findList() {
        return this.findList(DEFAULT_PAGE_SIZE);
    }

    @Override
    public List<Article> findList(Integer limit) {
        return this.findList(0, limit);
    }

    @Override
    public List<Article> findList(Integer page, Integer limit) {
        return this.selectByTypes(null, page, limit);
    }

    @Override
    public List<Article> selectByTypes(Integer articleType, Integer page, Integer limit) {
        ArticleExample example = new ArticleExample();
        example.setOrderByClause("create_time DESC");
        if(articleType != null){
            example.createCriteria().andArticleTypeEqualTo(articleType);
        }
        page = page == null ? 0: page;
        limit = limit == null ? Constant.DEFAULT_PAGE_SIZE : limit;
        RowBounds rowBounds = new RowBounds(page*limit, limit);

        return articleMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
    }

    @Override
    public Article selectById(String id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public long count(int articleType) {
        ArticleExample example = new ArticleExample();
        example.createCriteria().andArticleTypeEqualTo(articleType);
        return articleMapper.countByExample(example);
    }

    @Override
    public int insert(Article article) {
        article.setCreateTime(LocalDateTime.now());
        article.setUpdateTime(LocalDateTime.now());
        article.setDeleteFlag(Boolean.FALSE);
        article.setForeword(CommonUtils.replaceLineCharacter(article.getForeword()));
        return articleMapper.insert(article);
    }
}
