package com.paotui.mapper;

import com.paotui.entity.Buy;

import java.util.List;
import java.util.Map;

public interface BuyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Buy record);

    int insertSelective(Buy record);

    Buy selectByPrimaryKey(Integer id);

    List<Buy> selectByOrder(Map map);

    int updateByPrimaryKeySelective(Buy record);

    int updateByPrimaryKeyWithBLOBs(Buy record);

    int updateByPrimaryKey(Buy record);
}