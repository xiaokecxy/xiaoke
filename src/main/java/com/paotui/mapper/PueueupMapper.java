package com.paotui.mapper;

import com.paotui.entity.Pueueup;

import java.util.List;
import java.util.Map;

public interface PueueupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pueueup record);

    int insertSelective(Pueueup record);

    Pueueup selectByPrimaryKey(Integer id);

    List<Pueueup> selectByOrder(Map map);

    int updateByPrimaryKeySelective(Pueueup record);

    int updateByPrimaryKey(Pueueup record);
}