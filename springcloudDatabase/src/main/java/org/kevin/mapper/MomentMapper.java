package org.kevin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.kevin.model.Moment;
import org.kevin.model.MomentExample;

import java.util.List;

@Mapper
public interface MomentMapper {
    long countByExample(MomentExample example);

    int deleteByExample(MomentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Moment record);

    int insertSelective(Moment record);

    List<Moment> selectByExampleWithRowbounds(MomentExample example, RowBounds rowBounds);

    List<Moment> selectByExample(MomentExample example);

    Moment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Moment record, @Param("example") MomentExample example);

    int updateByExample(@Param("record") Moment record, @Param("example") MomentExample example);

    int updateByPrimaryKeySelective(Moment record);

    int updateByPrimaryKey(Moment record);
}