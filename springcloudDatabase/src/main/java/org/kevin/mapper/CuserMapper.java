package org.kevin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kevin.model.Cuser;

@Mapper
public interface CuserMapper {
    int deleteByPrimaryKey(String id);

    int insert(Cuser record);

    int insertSelective(Cuser record);

    Cuser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Cuser record);

    int updateByPrimaryKey(Cuser record);
}