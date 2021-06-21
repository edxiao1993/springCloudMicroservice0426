package org.kevin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kevin.model.Post;

@Mapper
public interface PostMapper {
    int deleteByPrimaryKey(String id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}