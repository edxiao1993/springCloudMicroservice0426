package org.kevin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.kevin.model.AlertWall;
import org.kevin.model.AlertWallExample;

import java.util.List;

@Mapper
public interface AlertWallMapper {
    long countByExample(AlertWallExample example);

    int deleteByExample(AlertWallExample example);

    int deleteByPrimaryKey(String id);

    int insert(AlertWall record);

    int insertSelective(AlertWall record);

    List<AlertWall> selectByExampleWithRowbounds(AlertWallExample example, RowBounds rowBounds);

    List<AlertWall> selectByExample(AlertWallExample example);

    AlertWall selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AlertWall record, @Param("example") AlertWallExample example);

    int updateByExample(@Param("record") AlertWall record, @Param("example") AlertWallExample example);

    int updateByPrimaryKeySelective(AlertWall record);

    int updateByPrimaryKey(AlertWall record);
}