package com.paotui.mapper;

import com.paotui.entity.userDetails;

public interface userDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userDetails record);

    int insertSelective(userDetails record);

    userDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userDetails record);

    int updateByPrimaryKey(userDetails record);

    userDetails findByUid(Integer uid);

}