package org.kevin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.kevin.model.Picture;
import org.kevin.model.PictureExample;

import java.util.List;

@Mapper
public interface PictureMapper {
    long countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(String id);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExampleWithRowbounds(PictureExample example, RowBounds rowBounds);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}