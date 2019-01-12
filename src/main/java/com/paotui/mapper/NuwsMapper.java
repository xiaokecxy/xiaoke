package com.paotui.mapper;

import com.paotui.entity.Nuws;

import java.util.List;
import java.util.Map;

public interface NuwsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nuws record);

    int insertSelective(Nuws record);

    Nuws selectById(Integer id);

    int selectCount();

    List<Nuws> selectAll(Map map);

    Nuws selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nuws record);

    int updateByPrimaryKeyWithBLOBs(Nuws record);

    int updateByPrimaryKey(Nuws record);
}