package com.paotui.mapper;

import com.paotui.entity.Give;

import java.util.List;
import java.util.Map;

public interface GiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Give record);

    int insertSelective(Give record);

    Give selectByPrimaryKey(Integer id);

    List<Give> selectByOrder(Map map);

    int updateByPrimaryKeySelective(Give record);

    int updateByPrimaryKey(Give record);
}