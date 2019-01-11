package com.paotui.mapper;

import com.paotui.entity.Get;

import java.util.List;
import java.util.Map;

public interface GetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Get record);

    int insertSelective(Get record);

    Get selectByPrimaryKey(Integer id);

    List<Get> selectByOrder(Map map);

    int updateByPrimaryKeySelective(Get record);

    int updateByPrimaryKey(Get record);
}