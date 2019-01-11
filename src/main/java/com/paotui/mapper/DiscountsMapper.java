package com.paotui.mapper;

import com.paotui.entity.Discounts;

public interface DiscountsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Discounts record);

    int insertSelective(Discounts record);

    Discounts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Discounts record);

    int updateByPrimaryKey(Discounts record);
}