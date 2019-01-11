package com.paotui.mapper;

import com.paotui.entity.ptUser;

public interface ptUserMapper {
    int deleteByPrimaryKey(Integer id);

    //添加(注册)
    int insert(ptUser user);

    int insertSelective(ptUser record);

    //根据手机号查询(登录、忘记密码)
    ptUser selectByPrimaryKey(String mobile);

    int updateByPrimaryKeySelective(ptUser record);

    //修改密码
    int updateByPrimaryKey(ptUser record);


}