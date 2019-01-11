package com.paotui.mapper;

import com.paotui.entity.Help;

import java.util.List;
import java.util.Map;

public interface HelpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Help record);

    int insertSelective(Help record);

    Help selectByPrimaryKey(Integer id);

    List<Help> selectByOrder(Map map);

    int updateByPrimaryKeySelective(Help record);

    int updateByPrimaryKey(Help record);
}