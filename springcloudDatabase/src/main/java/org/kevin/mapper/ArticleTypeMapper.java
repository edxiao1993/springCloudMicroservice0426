package org.kevin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kevin.model.ArticleType;

import java.util.List;

@Mapper
public interface ArticleTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    ArticleType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKey(ArticleType record);

    List<ArticleType> findList();
}