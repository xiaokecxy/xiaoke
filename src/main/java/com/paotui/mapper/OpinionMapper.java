package com.paotui.mapper;

import com.paotui.entity.Opinion;

public interface OpinionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Opinion record);

    int insertSelective(Opinion record);

    Opinion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Opinion record);

    int updateByPrimaryKey(Opinion record);
}