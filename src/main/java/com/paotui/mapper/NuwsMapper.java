package com.paotui.mapper;

import com.paotui.entity.Nuws;

public interface NuwsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nuws record);

    int insertSelective(Nuws record);

    Nuws selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nuws record);

    int updateByPrimaryKeyWithBLOBs(Nuws record);

    int updateByPrimaryKey(Nuws record);
}